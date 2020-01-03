package com.java.Java8Program;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> fun=i->i*i;
		System.out.println("the square root of 50:"+fun.apply(50));
		System.out.println("The square root of 45:"+fun.apply(45));
		

	}

}
