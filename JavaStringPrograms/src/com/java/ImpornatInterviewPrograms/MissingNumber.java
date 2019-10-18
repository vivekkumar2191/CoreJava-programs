package com.java.ImpornatInterviewPrograms;
import java.util.ArrayList;
import java.util.HashSet;
public class MissingNumber {
	
	public static void findMissingNum(int a[],int low,int high){
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			hs.add(a[i]);
		}
		for(int i=low;i<=high;i++){
			if(!hs.contains(i)){
				System.out.println(i+" ");
			}
		}
	
		
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={13,17,19,29,35};
		int low=13 ,high=35;
		findMissingNum(arr,low,high);

	}

}
