package com.codegnan.OOPexamples;

public class GeometryDemo {

	public static void main(String[] args) {
		Geometry shape=new Geometry();
		shape.base=10;
		shape.height=6;
		shape.sideA=5;
		shape.sideB=6;
		shape.sideC=7;
		shape.radius=7;
		System.out.println("instance methods");
		
		
		//with return with para
		double rectangleArea=shape.calculateRectangleArea(12,5);
		System.out.println("Rectangle Area : "+rectangleArea);
		
		
		//without return with para
		shape.printTrianglePerimeter(5,6,7);
		
		
		//without return without para
		shape.displayData();
		
		//with return without para
		double triangleArea=shape.storedTriangleArea();
		System.out.println("storedTriangleArea : "+triangleArea);
		
		
		
		
		//static methods
		//with return with para
		double circleArea=Geometry.calculateCircleArea(7);
		System.out.println("circle Area : "+circleArea);
		
		//without return with para
		Geometry.printCircleCircumference(7);
		
		//without return without para
		Geometry.printFixedTrapeziumArea();
		
		//with return without para
		double fixedTriangleArea=Geometry.getFixedTriangleArea();
		System.out.println("Fixed Triangle Area : "+fixedTriangleArea);
		
		
			
		}
	}


