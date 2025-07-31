package com.javaintro;

class Shape
{
	int area (int a)
	{
		return a*a;
		
	}
	int area(int length,int width)
	{
		return length*width;
		
	}
	int perimeter(int b) {
		return 4*b;
	}
	int perimeter(int length,int width)
	{
		return 2*(length+width);
	}
	
}
public class Question14 {
	public static void main(String[] args)
	{
		Shape s = new Shape();
		System.out.println("Area of Square:"+s.area(6));
		System.out.println("Area of Rectangle:"+s.area(10,20));
		System.out.println("Perimeter of Square:"+s.perimeter(6));
		System.out.println("Perimeter of Rectangle:"+s.perimeter(4,6));
		
	}

}