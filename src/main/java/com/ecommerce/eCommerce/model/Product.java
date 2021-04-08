package com.ecommerce.eCommerce.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "product")
@DynamicUpdate
public class Product {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "product_name",nullable = true)
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "price",nullable = true)
    private Integer price;

    @Column(name = "shipping_charge",nullable = true)
    private Integer shipping_charge;

    @Column(name = "category_id",nullable = true)
    private Integer categoryId;

    @ManyToOne(cascade = { CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getShipping_charge() {
        return shipping_charge;
    }

    public void setShipping_charge(Integer shipping_charge) {
        this.shipping_charge = shipping_charge;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
