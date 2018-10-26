package com.java.javaDatastructer.Array.ArrayProgram;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[][]={{1,2,3},{7,5,9},{11,13,17}};
		//int  [][={1,2,3,4,5,8,9,10,18};
		//print 2D array
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			}
		//print 2d array by using foreach loop
		System.out.println("print the array by using foreach loop::");
		for(int []s1:arr){
			for(int s2:s1){
				System.out.print(s2+ " "+ " ");
			}
		System.out.println();
		}
		
	}

	}


