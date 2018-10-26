package com.java.ConstructerProgram;

class A{
	public A(){
		System.out.println("Parent non parameterise const");
	}
	public A(int b){
		this();
		System.out.println("parent parameterise constuctor");
	}
	
	
}
class B extends A{
	public B(){
		System.out.println("child non-parameterise constuctor");
	}
	public B(int b){
		this();
		System.out.println(b+3);
	}
}
public class ConstructerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new B(5);
	}

}
