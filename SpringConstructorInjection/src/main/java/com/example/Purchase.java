package com.example;
import java.util.Date;
public class Purchase {
	
	    private int purchaseId;
	    private String purchaseDate;
	    private Product product;

	    // Constructor injection
	    public Purchase(int purchaseId, String purchaseDate, Product product) {
	        this.purchaseId = purchaseId;
	        this.purchaseDate = purchaseDate;
	        this.product = product;
	    }

	    public void displayPurchaseDetails() {
	        System.out.println("Purchase ID   : " + purchaseId);
	        System.out.println("Purchase Date : " + purchaseDate);
	        product.displayProductDetails();
	    }
	}

