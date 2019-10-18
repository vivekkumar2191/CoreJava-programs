package com.java.collection.Program;
import java.util.*;
public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet set=new LinkedHashSet();
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
       System.out.println(set);
	}

}
class Student{
	
	 private int sid;
	Student(int sid){
		this.sid=sid;
	}
	public String toString(){
		return ""+sid;
		
	}
	
	
	
}
