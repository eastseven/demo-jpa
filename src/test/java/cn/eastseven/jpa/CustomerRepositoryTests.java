package cn.eastseven.jpa;

import cn.eastseven.RepositoryTestsParent;
import cn.eastseven.jpa.entity.Cart;
import cn.eastseven.jpa.entity.CartProduct;
import cn.eastseven.jpa.entity.Customer;
import cn.eastseven.jpa.repository.CustomerRepository;
import cn.eastseven.jpa.repository.ProductRepository;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by dongqi on 17/3/9.
 */
@Slf4j
public class CustomerRepositoryTests extends RepositoryTestsParent {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ProductRepository productRepository;

    @Test
    public void testAdd() {
        Customer customer = new Customer("EastSeven");
        customerRepository.save(customer);
        Assert.assertNotNull(customer);
        log.debug("{}", customer);

        List<CartProduct> products = Lists.newArrayList();
        Cart cart = customer.getCart();
        productRepository.findAll().forEach(product ->
                products.add(new CartProduct(cart, product, RandomUtils.nextInt(2, 10)))
        );

        cart.setProductList(products);
        customerRepository.save(customer);
        log.debug("{}", customer);

        customer.getCart().getProductList().forEach(p -> log.debug("{},{},{},{}", p.getId(), p.getAmount(), p.getTotalFee(), p.getProduct().getPrice()));
    }
}
