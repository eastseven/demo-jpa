package cn.eastseven;

import cn.eastseven.jpa.entity.Category;
import cn.eastseven.jpa.entity.Product;
import cn.eastseven.jpa.repository.CategoryRepository;
import cn.eastseven.jpa.repository.ProductRepository;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
@SpringBootApplication
public class DemoJpaApplication implements CommandLineRunner {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    @Value("${spring.datasource.initialize}")
    boolean DATA_INIT;

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... strings) throws Exception {
        log.info("{}", Arrays.toString(strings));
        log.info("数据初始化 {}", DATA_INIT);

        if (DATA_INIT) {
            List<Category> categories = categoryRepository.findAll();
            List<Product> products = productRepository.findAll();
            final int seed = (int) productRepository.count();

            for (Category category : categories) {
                int size = RandomUtils.nextInt(1, seed);
                Collections.shuffle(products);
                category.setProducts(Lists.newArrayList(products.subList(0, size)));
                categoryRepository.save(category);
            }
        }
    }
}
