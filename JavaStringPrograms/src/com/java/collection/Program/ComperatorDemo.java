package com.java.collection.Program;
import java.util.*;
public class ComperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tset=new TreeSet(new SidComparator());
		tset.add(new Student2(12,"Vivek"));
		tset.add(new Student2(15,"Debo"));
		tset.add(new Student2(18,"Ritesh"));
		Iterator itr=tset.iterator();
		if(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
class Student2{
	
	 int sid;
      String name;
	Student2(int sid,String name){
		
		this.sid=sid;
		this.name=name;
		
		
	}
	public String toString(){
		return sid+ "\t" +name; 
	}
}
class SidComparator implements Comparator{
	
	public int compare(Object obj1,Object obj2){
		if(obj1 instanceof Student2 && obj2 instanceof Student2){
			Student2 s2=(Student2)obj1;
			Student2 s3=(Student2)obj2;
			return s2.sid-s3.sid;
		}
		
		return 0;
		
	}
	
	
	
	
	
	
}