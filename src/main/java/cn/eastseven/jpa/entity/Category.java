package cn.eastseven.jpa.entity;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Created by dongqi on 17/3/9.
 */
@Data
@Entity
@Table(name = "t_category")
@ToString(exclude = {"parent", "children"}, of = {"id", "name", "level", "createTime"})
public class Category extends BaseEntity {

    public Category() {
    }

    public Category(String name, Category parent) {
        this.name = name;
        this.parent = parent;

        if (this.parent != null) {
            this.level = parent.getLevel() + 1;
        }
    }

    @Column(name = "category_name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Category> children = Lists.newArrayList();

    @Column(name = "category_level", columnDefinition = "tinyint not null default 1 comment '分类等级'")
    private int level = 1;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "t_category_product",
            joinColumns = @JoinColumn(name = "c_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "p_id", referencedColumnName = "id"))
    private List<Product> products = Lists.newArrayList();

}