package com.javaintro;
	
		interface Drawable {
		    void drawingColor();
		    void thickness();
		}

		interface Fillable {
		    void fillingColor();
		    void size();
		}

		class Line implements Drawable, Fillable {
		    public void drawingColor() {
		        System.out.println("Line Drawing Color: Black");
		    }

		    public void thickness() {
		        System.out.println("Line Thickness: 2px");
		    }

		    public void fillingColor() {
		        System.out.println("Line has no filling color.");
		    }

		    public void size() {
		        System.out.println("Line Length: 10 units");
		    }
		}

		class Circle implements Drawable, Fillable {
		    public void drawingColor() {
		        System.out.println("Circle Drawing Color: Blue");
		    }

		    public void thickness() {
		        System.out.println("Circle Thickness: 3px");
		    }

		    public void fillingColor() {
		        System.out.println("Circle Filling Color: Light Blue");
		    }

		    public void size() {
		        System.out.println("Circle Radius: 5 units");
		    }
		}

		class Square implements Drawable, Fillable {
		    public void drawingColor() {
		        System.out.println("Square Drawing Color: Red");
		    }

		    public void thickness() {
		        System.out.println("Square Thickness: 4px");
		    }

		    public void fillingColor() {
		        System.out.println("Square Filling Color: Pink");
		    }

		    public void size() {
		        System.out.println("Square Size: 8x8 units");
		    }
		}

		public class Shapes {
		    public static void main(String[] args) {
		        Line line = new Line();
		        Circle circle = new Circle();
		        Square square = new Square();

		        System.out.println("--- Line ---");
		        line.drawingColor();
		        line.thickness();
		        line.fillingColor();
		        line.size();

		        System.out.println("\n--- Circle ---");
		        circle.drawingColor();
		        circle.thickness();
		        circle.fillingColor();
		        circle.size();

		        System.out.println("\n--- Square ---");
		        square.drawingColor();
		        square.thickness();
		        square.fillingColor();
		        square.size();
		    }
		

	}


