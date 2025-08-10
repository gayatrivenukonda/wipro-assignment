package com.example.SpringBootAssign;

public class Account {
	    private String id;
	    private String type;
	    private String status;

	    // Constructor
	    public Account(String id, String type, String status) {
	        this.id = id;
	        this.type = type;
	        this.status = status;
	    }

	    // Getters
	    public String getId() { return id; }
	    public String getType() { return type; }
	    public String getStatus() { return status; }

	    // toString()
	    @Override
	    public String toString() {
	        return "Account{id='" + id + "', type='" + type + "', status='" + status + "'}";
	    }
	}