package com.java.MainProgram;

public class FactorialDemo {
    public static int fact(int n){
    	if(n==0){
    		return 1;
    	}
    	return n*fact(n-1);
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println("Factorial of " + num + " is "  +fact(5));

	}

}
