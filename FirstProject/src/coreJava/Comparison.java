package coreJava;

public class Comparison {


	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		int c = 7;
		int d = 8;
		
		
		if(a == b) 
			System.out.println("a is equal to b");
		
		if(c != d) 
			System.out.println("c is not equal to d");
		
		if(a>b)
			System.out.println("a is greater than b");
		
		if(c<a)
		System.out.println("c is less than a");
	
		if(a == b) {
			System.out.println("new : a is equal to b");
		}else {
			System.out.println("new : a is not equal to b");
		}
	}

}
