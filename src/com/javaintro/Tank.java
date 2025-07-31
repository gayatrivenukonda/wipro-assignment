package com.javaintro;

public class Tank {
	
	    private boolean isFilled = false;
	    private boolean isReleased = false;

	    public void fill() {
	        isFilled = true;
	        System.out.println("Tank filled.");
	    }

	    public void empty() {
	        if (isFilled) {
	            isFilled = false;
	            System.out.println("Tank emptied.");
	        } else {
	            System.out.println("Tank is already empty.");
	        }
	    }

	    public void releaseTank() {
	        if (!isReleased) {
	            isReleased = true;
	            System.out.println("Tank resources released properly.");
	        }
	    }

	    @Override
	    protected void finalize() throws Throwable {
	        if (!isReleased) {
	            System.out.println("Error: Tank was not properly released before garbage collection!");
	        } else {
	            System.out.println("Tank was released correctly.");
	        }
	        super.finalize();
	    }
	}


