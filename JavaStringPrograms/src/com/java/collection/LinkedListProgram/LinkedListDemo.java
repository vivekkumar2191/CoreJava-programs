package com.java.collection.LinkedListProgram;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("Darmesh");
		l.add("Suresh");
		l.add("Mukesh");
		System.out.println(l);
		l.add(0, "Vivek");
		l.getFirst();
		System.out.println(l);
		l.add(1, "Debo");
		System.out.println(l);
		l.set(0, "SoftwareDeveloper");
		System.out.println(l);
		l.addFirst("vivek");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);

	}

}
