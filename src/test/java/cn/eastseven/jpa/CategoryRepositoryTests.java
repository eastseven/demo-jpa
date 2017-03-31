package cn.eastseven.jpa;

import cn.eastseven.RepositoryTestsParent;
import cn.eastseven.jpa.entity.Category;
import cn.eastseven.jpa.entity.QCategory;
import cn.eastseven.jpa.repository.CategoryRepository;
import cn.eastseven.jpa.repository.ProductRepository;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dongqi on 17/3/9.
 */
@Slf4j
public class CategoryRepositoryTests extends RepositoryTestsParent {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    @Test //级联添加
    public void testAdd() {
        Category root = new Category("root", null);

        Category lvA = new Category("分类1", root);
        lvA.setChildren(Lists.newArrayList(new Category("分类1-1", lvA), new Category("分类1-2", lvA)));

        Category lvB = new Category("分类2", root);
        lvB.setChildren(Lists.newArrayList(new Category("分类2-1", lvB)));

        Category lvB2 = new Category("分类2-2", lvB);
        lvB2.setChildren(Lists.newArrayList(new Category("分类2-2-1", lvB2)));
        lvB.getChildren().add(lvB2);

        root.setChildren(Lists.newArrayList(lvA, lvB));

        assertNull(root.getId());
        categoryRepository.save(root);
        assertNotNull(root.getId());

        log.debug("{}, {}", root, categoryRepository.count());

        categoryRepository.findAll().forEach(category -> log.debug("{}, children={}", category, category.getChildren().size()));
    }

    @Test
    public void testQuery() {
        long count = categoryRepository.count();
        Assert.assertNotSame(0L, count);

        categoryRepository.findAll().forEach(category -> log.debug("{}, children={}", category, category.getChildren().size()));

        List<Category> queryResult = Lists.newArrayList(categoryRepository.findAll(QCategory.category.name.like("%电脑%")));
        assertNotNull(queryResult);
        assertFalse(queryResult.isEmpty());
        queryResult.forEach(category -> log.info("\t-----\t{}", category.getName()));
    }
}
