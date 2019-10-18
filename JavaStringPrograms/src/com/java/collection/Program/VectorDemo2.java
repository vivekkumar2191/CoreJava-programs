package com.java.collection.Program;
import java.util.*;
public class VectorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v =new Vector();
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.addElement("java");
		v.addElement("oracle");
		v.addElement("jax-rs");
		v.addElement("webservices");
		v.addElement("database");
		v.addElement("javascript");
		v.addElement("node.js");
		v.addElement("angular.js");
		v.addElement("mongodb");
		v.addElement("spring");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.addElement("hibernate");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());

	}

}
