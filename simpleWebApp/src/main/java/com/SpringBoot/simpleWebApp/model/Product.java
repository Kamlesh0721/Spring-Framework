package com.SpringBoot.simpleWebApp.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private int id;

    public int getId() {
        return id;
    }

    public String getProdName() {
        return prodName;
    }

    public int getPrice() {
        return price;
    }

    private String prodName;
    private int price;

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public Product(){
    }
    public Product(int id,String prodName,int price){
        this.id=id;
        this.prodName=prodName;
        this.price=price;
    }
}
