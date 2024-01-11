package com.it.bd;

import java.util.Scanner;

public class ConditionalExample {
	
	public static void main(String[] args) {
		
	Scanner	input = new Scanner(System.in);
	
	System.out.println("Please enter 1st number");
	int number1 = input.nextInt();
	
	System.out.println("Please enter 2nd number");
	int number2 = input.nextInt();
	
	if(number1>number2) {
		System.out.println(number1+" is greatter than "+number2);
	}
	else if(number1<number2){
	System.out.println(number1+" is less than "+number2);
	}
	
	else if(number1==number2){
		System.out.println(number1+" is Equal than "+number2);
	}
	else {
		System.out.println("Something went wrong...");
	}
	
	Scanner	inp = new Scanner(System.in);
	System.out.println("Please enter 1st name");
	String name1 = inp.nextLine();
	
	System.out.println("Please enter 2nd name");
	String name2 = inp.nextLine();

	if(name1.equals(name2)) {
	System.out.println(name1+" is exact same to "+name2);
	
	}else if(name1.contains(name2)) {
		System.out.println(name1+" is contains "+name2);
	
	}else if(name1.equalsIgnoreCase(name2)) {
		System.out.println(name1+" is simmilar to "+name2);
		
	}else {
		System.out.println("Something went wrong...");
	}
	
	
	}

}
