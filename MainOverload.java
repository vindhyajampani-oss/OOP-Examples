package com.codegnan.OOPexamples;

public class MainOverload {

	public static void main(String[] args) {
		OverloadDemo o1= new OverloadDemo();
		o1.test();
		o1.test(10);
		System.out.println(o1.test(10));//automatic promotion in over loading
		o1.test(20,30);
		System.out.println(o1.test(12.5));

	}

}
