package com.java.javaDatastructer.Array.ArrayProgram;

public class PassingArrayToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,5,6,8,9};
		sum(arr);
		sub(arr);
	}
	public static void sum(int []a){
		//getting sum of array value
		int sum=0;
		for(int i=0;i<a.length;i++){
		sum+=a[i];
		}
		System.out.println("sum of the array is:"+sum);
		
	}
	public static void sub(int []b){
		int sub=0;
		//print sum of array by using foreach loop
				for(int s1:b){
					sub-=s1;
					}
				System.out.println("sub of the arry by using foreach loop:"+sub);
		
	}
	

}
