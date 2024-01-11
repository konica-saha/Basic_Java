package com.it.bd;

public class StaticVsNonStatic {
	
	/*
	 * Static Method: static, non-static(object)
	 * Non Static Method: static, non-static
	 * 
	 */
	
	static int s=10;
	int d =20;
	
	//Static method
	public static void sub(int x, int y) {
		int sub = x-y;
		System.out.println("Sub: "+sub);
		System.out.println(s);
	}
	
	//Non Static Method
	public void devision(int a, int b) {
		System.out.println("Devision: "+(a/b));
		System.out.println(s);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		sub(40,10);
		
		
		//object
		StaticVsNonStatic obj= new StaticVsNonStatic();
		obj.devision(20,10);

	}
	
	static {
	System.out.println("Static................");

	}

}
