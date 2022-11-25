package com.demo;
import java.util.*; 

public class ArryList {
	public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>(); //Creating arraylist  
	  list.add("hjk"); //Adding object in arraylist    
	  list.add("chgh");    
	  list.add("trftygyuj");    
	  list.add("gujuyhj");    
	  //Traversing list through Iterator  
	  Iterator itr=list.iterator(); //getting the Iterator  
	  while(itr.hasNext()){ //check if iterator has the elements  
	   System.out.println(itr.next()); //printing the element and move to next  
	  }  
	 }  
}
