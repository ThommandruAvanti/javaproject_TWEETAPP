package com.demo;

public class NewProduct {
	public static void main(String args[]) {
		Product x=Product.getInstance();
		Product y=Product.getInstance();
		Product Z=Product.getInstance();
		System.out.println("Hashcode of x is"+x.hashCode());
		System.out.println("Hashcode of y is"+x.hashCode());
		System.out.println("Hashcode of z is"+x.hashCode());
		if(x==y & y == Z) {
			System.out.println("Three objects point to the same memory location on the heap i.e,to the same object");
		}
		else {
			System.out.println("Three object DO NOT point to the same memory location on heap");
		}
		
		
	}

}
