package cn.eastseven.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by dongqi on 17/3/9.
 */
@Data
@Entity
@Table(name = "t_customer")
public class Customer extends BaseEntity {

    public Customer() {
        this.cart = new Cart();
        this.cart.setOwner(this);
    }

    public Customer(String name) {
        this.cart = new Cart();
        this.cart.setOwner(this);
        this.name = name;
    }

    private String name;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private Cart cart;

}
