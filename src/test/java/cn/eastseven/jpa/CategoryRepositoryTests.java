package cn.eastseven.jpa;

import cn.eastseven.RepositoryTestsParent;
import cn.eastseven.jpa.entity.Category;
import cn.eastseven.jpa.repository.CategoryRepository;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dongqi on 17/3/9.
 */
@Slf4j
public class CategoryRepositoryTests extends RepositoryTestsParent {

    @Autowired
    CategoryRepository categoryRepository;

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
        categoryRepository.save(root);

        log.debug("{}, {}", root, categoryRepository.count());

        categoryRepository.findAll().forEach(category -> log.debug("{}, children={}", category, category.getChildren().size()));
    }

    @Test
    public void testQuery() {
        long count = categoryRepository.count();
        Assert.assertNotSame(0L, count);

        categoryRepository.findAll().forEach(category -> log.debug("{}, children={}", category, category.getChildren().size()));
    }
}
