//program to print dublicate number with less time complexity O(n) and Space complexity s(1)
package com.java.javaDatastructer.Array.ArrayProgram;

public class FindDublicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      FindDublicateNum fdm=new FindDublicateNum();
      int arr[]={1,2,3,1,3,6,6};
      int size_arr=arr.length;
      fdm.printDublicate(arr,size_arr);
      
	}

	private void printDublicate(int[] arr, int size) {
		int i;
		for(i=0;i<size;i++){
			if(arr[Math.abs(arr[i])]>=0){
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			}
			else{
				System.out.print(Math.abs(arr[i])+ " ");
			}
		}
		
	}

}
