package com.java.javaDatastructer.Array.ArrayProgram;
class Student{
	public int roll_no;
	public String name;
	public Student(int roll_no, String name) {
	
		this.roll_no = roll_no;
		this.name = name;
	}
	
	
	
}
public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//allocating the 5 object of type Student
		Student arr[]=new Student[5];
		arr[0]=new Student(101,"debo");
		arr[1]=new Student(102,"vivek");
		arr[2]=new Student(103,"Ritesh");
		arr[3]=new Student(104,"Vikash");
		arr[4]=new Student(105,"vishal");
		//accessing the element of specified array
		for (int i = 0; i < arr.length; i++){ 
            System.out.println("Element at " + i + " : " + 
		                arr[i].roll_no +" "+ arr[i].name);
	}
	//accesing the student object by using foreach loop
	for(Student s1:arr){
		System.out.println("student object:"+arr +":" +s1.roll_no +" "+s1.name);
		
	}
	
	
	}	

}
