package com.example;

public class ShoppingService {
	
	    public void addToCart(String item) {
	        System.out.println("Adding item to cart: " + item);
	    }

	    public void makePayment(double amount) {
	        System.out.println("Processing payment of $" + amount);
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Amount must be greater than 0");
	        }
	    }

	    public void placeOrder() {
	        System.out.println("Order has been placed successfully!");
	    }
	}

