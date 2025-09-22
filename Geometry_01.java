package com.codegnan.OOPexamples;

public class Geometry_01 {
   double length,width;
   double radius;
   double side;
   double base, height;
   
   static final double pi=3.14159;
   
   public static double calculateRectangleArea(double length,double width) {
		return length*width;
		
	}
   
   public static double calculateCircleArea(double radius) {
		return pi*radius*radius;
	}
   
   public static double calculatesquareArea(double side) {
	   return side * side;
   }
   
   public static double calculateTriangleArea(double base, double height) {
	   return 0.5 * base * height;
   }
   
   
   
}
