package com.example.controller;

import com.example.model.Product;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("productBean")
@SessionScoped // Keeps data alive as long as the browser session is active
public class ProductBean implements Serializable {

    private Product product;
    private List<Product> productList;
    private long nextId = 1;

    @PostConstruct
    public void init() {
        product = new Product();
        productList = new ArrayList<>();
        // Optional: Add some dummy data
        productList.add(new Product(nextId++, "Laptop", 1200.0));
    }

    // CREATE / UPDATE
    public void save() {
        if (product.getId() == null) {
            // New Product
            product.setId(nextId++);
            productList.add(product);
        } else {
            // Update existing - in a simple List CRUD,
            // the object in the list is already updated via JSF binding
        }
        product = new Product(); // Reset the form
    }

    // PREPARE UPDATE
    public void edit(Product p) {
        this.product = p;
    }

    // DELETE
    public void delete(Product p) {
        productList.remove(p);
    }

    // Getters and Setters (Required for JSF to access data)
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public List<Product> getProductList() { return productList; }
}