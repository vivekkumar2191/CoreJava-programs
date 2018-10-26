//finding the dublicate string in the paragraph
package com.java.programs;
import java.util.*;
public class FindDublicateString {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the paragraph:");
	String str=sc.nextLine();
	System.out.println(str);
	String arr[]=str.split(" ");
	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
	}
	
	HashMap<String,Integer> hmap=new HashMap<String,Integer>();
	for(int i=0;i<arr.length;i++){
		if(hmap.get(arr[i])==null){
			hmap.put(arr[i], 1);
			
		}else{
			int c=hmap.get(arr[i]);
			hmap.put(arr[i], c+1);
		}
		hmap.forEach((key,value) -> System.out.println(key +" : " + value));
	}
	

	}

}
