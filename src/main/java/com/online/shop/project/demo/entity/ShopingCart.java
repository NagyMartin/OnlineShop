package com.online.shop.project.demo.entity;

import java.util.List;

public class ShopingCart {

    // define fields

    private int id;
    private List<Product> productList;

    // define constructors

    public ShopingCart(){}

    public ShopingCart(int id, List<Product> productList) {
        this.id = id;
        this.productList = productList;
    }


    // define getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


    // define toString

    @Override
    public String toString() {
        return "ShopingCart{" +
                "id=" + id +
                ", productList=" + productList +
                '}';
    }
}
