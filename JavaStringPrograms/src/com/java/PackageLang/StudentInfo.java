package com.java.PackageLang;

public class StudentInfo {
	
	String name;
	int rollNo;
	

	public StudentInfo(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s1=new StudentInfo("vivek",10);
		StudentInfo s2=new StudentInfo("Rahul",12);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s2.toString());
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		/*public String toString() {
		 return getClass().getName() + "@" +
			Integer.toHexString(hashCode());
		 }
		
	   here getClass().getName() =>
			classname@hexa_decimal_String_representation_of_hashCode*/
	}

}
