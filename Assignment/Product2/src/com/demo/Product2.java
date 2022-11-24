package com.demo;
import java.io.*;
import java.util.*;

public class Product2 {
	static int product(int x,int y) {
		if(x<y)
			return product(y,x);
		else if (y!=0)
			return(x+product(x,y-1));
			else return 0;
		
		
	}
	public static void main(String[]args) {
		{
			int x=5,y=2;
			System.out.println(product(x,y));
			
		}
		
	}

}
