package cn.eastseven.jpa.entity;

import com.google.common.collect.Lists;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by dongqi on 17/3/9.
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_product", indexes = {@Index(name = "idx_product_status", columnList = "product_status")})
public class Product extends BaseEntity {

//    public Product() {
//    }
//
//    public Product(String name, String image, BigDecimal price, String overview, Status status, List<Category> categoryList) {
//        this.name = name;
//        this.image = image;
//        this.price = price;
//        this.overview = overview;
//        this.status = status;
//        this.categoryList = categoryList;
//    }

    @ManyToMany
    @JoinTable(name = "t_category_product",
            joinColumns = @JoinColumn(name = "p_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "c_id", referencedColumnName = "id"))
    private List<Category> categoryList = Lists.newArrayList();

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
