package com.demo;

public class Product {
	private static Product single_instance=null;
	public String s;
	private Product() {
		s="Hello I am a String part of Product class";
		
	
	}
	public static Product getInstance() {
		if(single_instance==null)
			single_instance=new Product();
		return single_instance;
		
	}
	

}
