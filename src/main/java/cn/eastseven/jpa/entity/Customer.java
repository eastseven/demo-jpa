package cn.eastseven.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by dongqi on 17/3/9.
 */
@Data
@Entity
@Table(name = "t_customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    public Customer() {
        this.cart = new Cart();
        this.cart.setOwner(this);
    }

    public Customer(String name) {
        this.cart = new Cart();
        this.cart.setOwner(this);
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime = new Date();

    private String name;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private Cart cart;

}
