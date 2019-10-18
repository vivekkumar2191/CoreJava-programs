package com.java.collection.Program;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection col=new ArrayList();
		System.out.println(col);
		System.out.println("Size:" +col.size());
		System.out.println("ISEmpty:"+col.isEmpty());
		System.out.println();
		
		
		col.add("debid");
		col.add("sashank");
		col.add("Niraj");
		col.add("somu");
		System.out.println(col);
		System.out.println("Size:" +col.size());
		System.out.println("ISEmpty:"+col.isEmpty());

	}

}
