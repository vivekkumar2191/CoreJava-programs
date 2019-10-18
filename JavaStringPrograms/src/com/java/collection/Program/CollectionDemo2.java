package com.java.collection.Program;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {

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
		System.out.println(col.contains("sashank"));
		System.out.println(col.contains("Sashank"));
		System.out.println(col.contains("Ravi"));
		System.out.println(col);
		System.out.println(col.remove("JAVA"));
		System.out.println(col.remove("somu"));
		System.out.println(col);
		col.clear();
		System.out.println(col);
		System.out.println(col.size());
	}

}
