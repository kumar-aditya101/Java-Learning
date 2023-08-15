package com.Kodnest.Method;

public class Example {

	public static void main(String[] args) {
		greet();
		int x = 20;
		int y =10;
		int result = multi(x,y);
		System.out.println("Multiplication Result is "+result);
		
		int result1 = add(x,y);
		System.out.println("Addition Result is "+result1);
		
		boolean result2 = checkGreater(x,y);
		System.out.println(result2);
		
		int result3 = add(x,y)/2;
		System.out.println(result3);

	}
	
	public static void greet() {
		System.out.println("Hello World..");
	}
	
	public static int add(int x,int y) {
		return x*y;
	}
	
	public static void Sub() {
		int a = 20;
		int b = 10;
		System.out.println("Substraction is "+(a-b));
	}
	
	public static int div(int m, int n) {
		return m/n;
	}
	
	public static int mod(int a, int b) {
		return a%b;
	}
	
	public static int multi(int x, int y) {
		return x*y;
	}
	
	public static boolean checkGreater(int x,int y) {
		return x>y;
	}

}
