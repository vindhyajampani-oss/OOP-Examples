package com.codegnan.OOPexamples;

public class FactorialusingRecurssion {
	
    public static int factorial(int n) {
    	if(n==0) {
    		return 1;
    	}
    	return n*factorial(n-1);//5*4*3*2*1*1
    }
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
