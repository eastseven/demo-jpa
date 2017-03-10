package cn.eastseven.jpa.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by dongqi on 17/3/9.
 */
@Setter
@Getter
@Builder
@Entity
@Table(name = "t_product", indexes = {@Index(name = "idx_product_status", columnList = "product_status")})
public class Product extends BaseEntity {

    public Product() {
    }

    public Product(String name, String image, BigDecimal price, String overview, Status status) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.overview = overview;
        this.status = status;
    }

    private String name;

    private String image;

    private BigDecimal price = new BigDecimal(0);

    private String overview;

    @Column(name = "product_status")
    @Enumerated(EnumType.ORDINAL)
    private Status status = Status.NORMAL;

    public enum Status {
        NORMAL(1), OFF(2);

        private int value;

        Status(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

}
