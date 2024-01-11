package com.it.bd;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		//ArrayList<datatype> arraylistnames = new ArrayList<datatype>();
		ArrayList<String> names = new ArrayList<String>();
		names.add("manaz");
		names.add("kona");
		System.out.println(names.size());
		System.out.println(names);
		
		names.add("mehar");
		names.add("fahim");
		System.out.println(names.size());
		System.out.println(names);
		
		names.remove(1);
		System.out.println(names.size());
		System.out.println(names);
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		names.clear();
		System.out.println(names.size());
	}

}
