package com.clay.peruvianpima.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="quantity")
    private int quantity;

    @Column(name="price")
    private double price;

    @Column(name="gender")
    private String gender;

    @Column(name="category")
    private String category;

    @Column(name="image_url")
    private String image_url;

    public Product(String name, int quantity, double price, String gender, String category, String image_url) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.gender = gender;
        this.category = category;
        this.image_url = image_url;
    }
}
