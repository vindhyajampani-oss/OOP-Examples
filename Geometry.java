package com.codegnan.OOPexamples;

public class Geometry {
  // instance variables
	double base,height;
	double sideA, sideB, sideC;
	double radius;
	static final double pi=3.14159;//static variable
	
	// instance methods in all four possible combinations
	
	//1.with return with parameter calculating rectangle area
	public double calculateRectangleArea(double length,double breadth) {
		return length*breadth;
		
	}
	
	//without return with parameter --> print triangle perimeter
	public void printTrianglePerimeter(double a, double b, double c) {
		double perimeter=a+b+c;
		System.out.println("Triangle perimeter : "+perimeter);
	}
	
	//without return without para
	public void displayData() {
		System.out.println("stored dimensions");
		System.out.println("base " + base + "height: " +height);
		System.out.println("sides " + sideA + ","+ sideB +"," + sideC);
		System.out.println("Radius : "+radius);
		
	}
	
	//with return without para
	public double storedTriangleArea() {
		return 8.5*base*height;
	}
	
	//static methods
	//1.with return with parameters calculate circle area
	public static double calculateCircleArea(double radius) {
		return pi*radius*radius;
	}
	
	//without return with parameter print circle circumference
	public static void printCircleCircumference(double radius) {
		double Circumference=2*pi*radius;
		System.out.println("circle Circumfernce : "+Circumference);
	}
	
	//without return without parameter
	public static void printFixedTrapeziumArea() {
		double a=0, b=6, h=4;
		double area=((a+b)/2)*b;
		System.out.println("Area of Trapezium : "+area);
	}
	
	//with return without parameter
	public static double getFixedTriangleArea() {
		double base=5, height=3;
		return 0.5*base*height;
	}
}
