// Java program to illustrate creating an array 
// of integers,  puts some values in the array, 
// and prints each value to standard output. 
  
package com.java.javaDatastructer.Array.ArrayProgram;

public class ArrayProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr=new int[10];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	arr[5]=60;
	arr[6]=70;
	arr[7]=80;
	arr[8]=90;
	// accessing the elements of the specified array 
	for(int i=0;i<arr.length;i++){
		System.out.println("element of index:"+ i +" :" +arr[i]);
		
	}
	for(int a:arr){
		System.out.println("element of index for loop:"+arr+":"+a);
	}
	}

}
