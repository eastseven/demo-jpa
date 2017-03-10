package cn.eastseven.jpa.repository;

import cn.eastseven.jpa.entity.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dongqi on 17/3/9.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
