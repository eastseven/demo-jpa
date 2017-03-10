package cn.eastseven.jpa;

import cn.eastseven.RepositoryTestsParent;
import cn.eastseven.jpa.entity.Product;
import cn.eastseven.jpa.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Created by dongqi on 17/3/9.
 */
@Slf4j
public class ProductRepositoryTests extends RepositoryTestsParent {

    @Autowired
    ProductRepository productRepository;

    @Test
    public void testAdd() {
        Product product = Product.builder()
                .status(Product.Status.OFF)
                .price(new BigDecimal(11488))
                .name("MacBook Pro 2016")
                .overview("Hello World")
                .image("http://www.laptopmag.com/images/uploads/4989/g/apple-macbook-pro-13-2016-nw-g01.jpg")
                .build();

        productRepository.save(product);
        Assert.assertNotNull(product);

        log.debug("{}, {}", product, product.getId());

        Assert.assertTrue(productRepository.exists(product.getId()));
    }
}
