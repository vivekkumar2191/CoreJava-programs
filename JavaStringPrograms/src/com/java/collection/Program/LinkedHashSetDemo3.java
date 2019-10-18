package com.java.collection.Program;
import java.util.*;
public class LinkedHashSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet set=new LinkedHashSet();
		set.add(new Student1(99));
		set.add(new Student1(99));
		set.add(new Student1(99));
		set.add(new Student1(99));
		set.add(new Student1(99));
		set.add(new Student1(99));
		System.out.println(set);

	}

}
class Student1{
	   private int sid;
	 Student1(int sid){
		 this.sid=sid;
	 }
	 public String toString(){
		 return ""+sid;
	 }
	 public int hashCode(){
		 System.out.println("**hashCode()**");
		return sid;
		 
	}
	 public boolean equals(Object obj){
		 System.out.println("**equals()**");
		 if(obj instanceof Student1){
			 Student1 st=(Student1)obj;
		 return this.sid==st.sid;
		 
		 }
		 return false;
	 }
	 
	
	
}

