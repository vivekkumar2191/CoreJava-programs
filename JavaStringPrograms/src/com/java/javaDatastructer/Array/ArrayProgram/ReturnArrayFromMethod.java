package com.java.javaDatastructer.Array.ArrayProgram;

public class ReturnArrayFromMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar1=m1();
		for(int i=0;i<ar1.length;i++){
			System.out.print(ar1[i]+" ");
			
		}
		System.out.println();
		System.out.println("array print by using foreach loop");
		for(int a1:ar1){
		
			System.out.print(a1+" ");
		}

	}
	public static int[] m1(){

		//return array by using method
		return new int[]{2,4,9,10};
	}

}
