package com.demo;

public class SingleProduct {
	public void show() {
		System.out.println("Inside show()method of ProductBox");
	}
	public static SingleProduct Createobj() {
		SingleProduct obj = null;
		if(obj==null) {
			obj=new SingleProduct();
		}
		return obj;
		
	}
	public void display1() {
		System.out.print("the object craetion complete");
	}
	public void display2() {
		System.out.print("the second object craetion complete");
	}
	public void display3() {
		System.out.print("the thard object craetion complete");
	}
	public static void main(String args) {
		SingleProduct single1=new SingleProduct();
		SingleProduct single2=new SingleProduct();
		SingleProduct single3=new SingleProduct();
		
		
		
	}


}
