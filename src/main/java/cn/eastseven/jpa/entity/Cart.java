package cn.eastseven.jpa.entity;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dongqi on 17/3/9.
 */
@Data
@Entity
@Table(name = "t_cart")
@ToString(exclude = {"owner"})
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cart_id")
    private Long id;

    @MapsId
    @OneToOne(mappedBy = "cart")
    @JoinColumn(name = "cart_id")
    private Customer owner;

    // 购买的商品
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<CartProduct> productList = Lists.newArrayList();

}
