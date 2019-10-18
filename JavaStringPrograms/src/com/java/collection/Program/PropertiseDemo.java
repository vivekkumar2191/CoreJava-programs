package com.java.collection.Program;

import java.util.Properties;

public class PropertiseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Properties p=new Properties();
       p.put("vivek-1", "vivek");
       p.put("vivek-2", "Dhiraj");
       p.put("vivek-3", "Vikash");
       p.put("vivek-4", "Debo");
       p.put("vivek-1", "vikaram");
       System.out.println(p);
	}

}
