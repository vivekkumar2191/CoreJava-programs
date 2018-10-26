package com.java.PackageLang;

public class StudentToStringMethod {
	String studname;
	int rollNum;
	

	public StudentToStringMethod(String studname, int rollNum) {
		super();
		this.studname = studname;
		this.rollNum = rollNum;
	}

	@Override
	public String toString() {
		/*return "StudentToStringMethod [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";*/
		return "StudentToStringMethod";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentToStringMethod s1=new StudentToStringMethod("Debo",22);
		StudentToStringMethod s2=new StudentToStringMethod("Satish",23);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.studname+ " " +s1.rollNum);
		System.out.println(s2.studname+ " " +s2.rollNum);
		

	}

}
