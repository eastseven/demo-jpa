package cn.eastseven.jpa.repository;

import cn.eastseven.jpa.entity.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dongqi on 17/3/9.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
