package com.example;

public class Product {
	    private int productId;
	    private String productName;
	    private double price;

	    public Product(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }

	    public void displayProductDetails() {
	        System.out.println("Product ID   : " + productId);
	        System.out.println("Product Name : " + productName);
	        System.out.println("Price        : " + price);
	    }
	}

