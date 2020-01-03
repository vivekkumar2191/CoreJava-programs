package com.java.Java8Program;

import java.util.ArrayList;
import java.util.List;

public class forEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("raina");
		list.add("Archana");
		list.add("Vivek");
		list.add("shiv");
		list.forEach(
				(f)->System.out.println(f)
				
				);
		

	}

}
