//package com.kodilla.hibernate.invoice;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//@Entity
//@Table(name = "PRODUCTS")
//public class Product {
//    private int id;
//    private String name;
//    private Item item;
//
//    public Product() {
//    }
//
//    public Product(String name) {
//        this.name = name;
//    }
//
//    @Id
//    @GeneratedValue
//    @NotNull
//    @Column(name = "PRODUCT_ID")
//    public int getId() {
//        return id;
//    }
//
//    @NotNull
//    @Column(name = "NAME")
//    public String getName() {
//        return name;
//    }
//
//    @OneToMany
//    public Item getItem() {
//        return item;
//    }
//
//    private void setId(int id) {
//        this.id = id;
//    }
//
//    private void setName(String name) {
//        this.name = name;
//    }
//
//    public void setItem(Item item) {
//        this.item = item;
//    }
//}
