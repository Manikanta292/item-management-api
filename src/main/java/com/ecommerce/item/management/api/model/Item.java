package com.ecommerce.item.management.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

/**
 * Item model representing a product in the system.
 * This class is used as a request and response object
 * for the Item REST APIs.
 */
public class Item {

    /**
     * Unique identifier for the item
     * Must be provided when creating an item.
     */
    @NotNull(message = "Item id is required")
    private Long id;

    /**
     * Name of the item
     * Cannot be null, empty, or contain only whitespace.
     */
    @NotBlank(message = "Item name is required")
    private String name;

    /**
     * Detailed description of the item
     * Cannot be null, empty, or contain only whitespace.
     */
    @NotBlank(message = "Item description is required")
    private String description;

    /**
     * Price of the item
     * Must be provided and must be greater than zero.
     */
    @NotNull(message = "Price is required")
    @Positive(message = "Price must be positive")
    private Double price;

    /**
     * Category of the item (e.g., Electronics, Clothing, Books)
     * Cannot be null, empty, or contain only whitespace.
     */
    @NotBlank(message = "Category is required")
    private String category;

    /**
     * Stock quantity available
     * Must be provided and must be a positive value.
     */
    @NotNull(message = "Stock quantity is required")
    @Positive(message = "Stock quantity must be positive")
    private Integer stockQuantity;

    /**
     * Default constructor
     */
    public Item() {
    }

    /**
     * Parameterized constructor
     */
    public Item(Long id, String name, String description, Double price, String category, Integer stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    //toString method
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}

