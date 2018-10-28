package com.java.CollectionMap;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// creating hashMap object
		HashMap<String,Integer> hmap=new HashMap<String,Integer>();
		hmap.put("vivek",1);
		hmap.put("Debo", 2);
		hmap.put("Satish", 30);
		hmap.put("Sunny",40);
		hmap.put("Debo",3);
		hmap.put("Chedi", 50);
		System.out.println(hmap);
	    System.out.println("adding dublicate value");
	    hmap.put("vivek",1);
	    hmap.put("null",null);
	    hmap.put(null,null);
	    hmap.put(null,null);
	    hmap.put("Debo",3);
	    System.out.println(hmap);
	    //output printing by using forEach()
	    System.out.println("output printing by using for each loop");
	   for(Map.Entry<String, Integer> entry:hmap.entrySet()){
		   System.out.println("Key:"+entry.getKey()+" "+"value:"+entry.getValue());
	   }
	   //iterating over key and value
	   System.out.println("/****iterating hashMap by using key and value***/9");
	   for(String key:hmap.keySet()){
		   System.out.println("key:" +key);
	   }
	   for(Integer value:hmap.values()){
		   System.out.println("value:"+value);
	   }
	   
	   
	   
		
		
	
	}

}
