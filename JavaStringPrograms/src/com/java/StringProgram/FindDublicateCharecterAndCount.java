package com.java.StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDublicateCharecterAndCount {

	private static Scanner sc;

	public static void main(String[] args) {
	
		System.out.println("Enter string:");
		sc = new Scanner(System.in);
		String st=sc.nextLine();
		char[] ch=st.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character ch1:ch){
			if(map.containsKey(ch1)){
				map.put(ch1, map.get(ch1)+1);
			}
			else{
				map.put(ch1,1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet=map.entrySet();
		System.out.printf("List of dublicate Charecter in string '%s' %n",st);
		for(Map.Entry<Character, Integer> entry:entrySet){
			if(entry.getValue()>1){
				System.out.printf("%s: %d %n",entry.getKey(),entry.getValue());
			}else{
				System.out.printf("%s: %d %n",entry.getKey(),entry.getValue());
			}
			
		}
		
		
		
	

	}

}
