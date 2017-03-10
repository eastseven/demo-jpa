package cn.eastseven.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by dongqi on 17/3/9.
 */
@Setter
@Getter
@Entity
@Table(name = "t_cart_product")
public class CartProduct extends BaseEntity {

    public CartProduct() {
    }

    public CartProduct(Cart cart, Product product, int amount) {
        this.cart = cart;
        this.product = product;

        if (this.product != null && this.product.getPrice() != null) {
            this.amount = amount;
            totalFee = product.getPrice().multiply(new BigDecimal(amount));
        }
    }

    private int amount = 1;

    private BigDecimal totalFee;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

}
