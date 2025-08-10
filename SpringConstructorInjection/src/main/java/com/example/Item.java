package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
	

	@Component
	public class Item {
	    private int id;
	    private String name;
	    private double price;
	    private Category category;

	    // Constructor with @Autowired
	    @Autowired
	    public Item(Category category) {
	        this.id = 1;
	        this.name = "Laptop";
	        this.price = 1200.0;
	        this.category = category;
	    }

	    public void displayDetails() {
	        System.out.println("Item ID: " + id);
	        System.out.println("Item Name: " + name);
	        System.out.println("Item Price: $" + price);
	        System.out.println("Category ID: " + category.getCategoryId());
	        System.out.println("Category Name: " + category.getCategoryName());
	    }
	}


