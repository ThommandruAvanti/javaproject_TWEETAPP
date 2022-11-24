package com.demo;


public class ClothingProduct {
	private int id;
	private String name;
	private float price;
	public ClothingProduct(int id,String name,float price) {
		super();
		this.id=id;
		this.name=name;
		this.price=price;
		
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}@Override
	public String toString() {
		return"Clothing[id="+id+",name="+name+",price="+price+"]";
		
	}public class Arry {
		ClothingProduct[] clothing=new ClothingProduct[6];
		public void main(String[] args) {
			clothing[0]=new ClothingProduct(1,"cloth1",12.5f);
			clothing[1]=new ClothingProduct(2,"cloth2",6.5f);
			clothing[2]=new ClothingProduct(3,"cloth3",9.5f);
			clothing[3]=new ClothingProduct(4,"cloth4",3.5f);
			clothing[4]=new ClothingProduct(5,"cloth5",8.5f);
			clothing[5]=new ClothingProduct(6,"cloth6",13.5f);
			int len =clothing.length;
			for(int i=0;i<len/2;i++) {
				ClothingProduct tclothing=null;
				tclothing=clothing[i];
				clothing[i]=clothing[len-i-1];
				clothing[len-i-1]=tclothing;
				
				
				
			}
			for(ClothingProduct clothing:clothing) {
				System.out.print(clothing.toString());
				
			}
				
			
			
			
		}

	}

	
	
}
