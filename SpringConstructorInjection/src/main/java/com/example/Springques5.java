package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.AppConfig;
import com.example.Item;
public class Springques5 {
	
	
	    public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	        Item item = context.getBean(Item.class);
	        item.displayDetails();
	    }
	}

/*
 Item ID: 1
Item Name: Laptop
Item Price: $1200.0
Category ID: 101
Category Name: Electronics
 */
