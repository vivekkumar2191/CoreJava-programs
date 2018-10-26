package com.java.StringProgram;
import java.util.*;

public class FindDublicateCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Nitin";
		String str1=str.toLowerCase();
		System.out.println(str1);
		String str2=str.toUpperCase();
		System.out.println(str2);
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		char[] ch=str1.toCharArray();
		for(char value:ch){
			if(Character.isAlphabetic(value)){
				
				if(charMap.containsKey(value)){
					charMap.put(value, charMap.get(value) + 1);
					System.out.println(charMap);

					}else{
						 charMap.put(value, 1);
						 System.out.println(charMap);
					}
				System.out.println("HashMap in the loop:"+charMap);
			
			}
			System.out.println(value);
		}
		
		System.out.println(charMap);
	}

}
