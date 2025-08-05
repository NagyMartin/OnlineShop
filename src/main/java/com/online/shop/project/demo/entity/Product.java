package com.online.shop.project.demo.entity;

public class Product {

    // define fields
    private int id;
    private String name;
    private double price;
    private String detail;

    // define constructors
    public Product(){}

    public Product(int id, String name, double price,String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }

    public Product(String name, double price, String detail) {
        this.name = name;
        this.price = price;
        this.detail = detail;
    }

    // define setter/getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    // define toString
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name = " + name + '\'' +
                ", price = " + price + '\'' +
                ", detail = " + detail +
                '}';
    }



}
