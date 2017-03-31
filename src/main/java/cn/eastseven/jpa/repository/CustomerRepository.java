package cn.eastseven.jpa.repository;

/**
 * Created by dongqi on 17/3/9.
 */

import cn.eastseven.jpa.entity.Customer;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>, QueryDslPredicateExecutor<Customer> {
}
