package com.java.collection.Program;
import java.util.*;
public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet set=new LinkedHashSet();
		set.add(new Long(50));
		set.add(new Integer(79));
		set.add(new Byte((byte)65));
		set.add(new Integer(65));
		set.add("A");
		System.out.println(set);
	}

}
