package com.java.CollectionMap;
import java.util.*;

public class FindDublicateCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDublicateCharecters("java");
		printDublicateCharecters("programming+\7");
		

	}
    public static void printDublicateCharecters(String word){
    	char[] ch=word.toCharArray();
    	System.out.print(ch);
    	// build HashMap with character and number of times they appear in String
    	Map<Character,Integer> map=new HashMap<Character,Integer>();
    	System.out.println(map);
    	for(Character ch1:ch){
    		if(map.containsKey(ch1)){
    			map.put(ch1, map.get(ch1)+1);
    			System.out.println(map);
    			
    		}else{
    			map.put(ch1, 1);
    		}
    	}
    	
    }
}