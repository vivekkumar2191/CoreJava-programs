package com.java.javaDatastructer.Array.ArrayProgram;

public class RotationOfArray {
	
	 void leftRotateByOne(int arr[],int d,int n){
		 for(int i=0;i<d;i++){
			 leftRotate(arr,n);
			 
		 }
		
	}
	 void leftRotate(int arr[],int n){
		 int i,temp;
		 temp=arr[0];
		 for(i=0;i<n-1;i++){
			 arr[i]=arr[i+1];
			 //System.out.println("this is array list sifting one unit");
			
		 }// System.out.println(arr[i]);
			 arr[i]=temp;
			// System.out.println("value of temp in arr");
			 //System.out.println(arr[i]);
			 
		 }
		 
	
	 public void printArray(int[] arr, int n) {
			// TODO Auto-generated method stub
			for(int i=0;i<n;i++){
				System.out.print(arr[i] +" ");
				
				
			}
		
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotationOfArray rotate=new RotationOfArray();
		int arr[]={8,2,3,4,5,6,7};
		//System.out.println(arr);
	     rotate.leftRotateByOne(arr,2,7);
	     rotate.printArray(arr,7);

	}

}
