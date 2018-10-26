package com.java.CollectionMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iterate map by using entry
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(12, 13);
		map.put(15,19 );
		System.out.println(map);
		for(Map.Entry<Integer, Integer> ch:map.entrySet()){
			System.out.println("key="+ch.getKey() +"value="+ch.getValue());
		}
		//iterate over key and value
		Map<String,Integer> map2=new HashMap<String,Integer>();
		System.out.println(map2);
		map2.put("vivek", 12);
		map2.put("ritesh", 15);
		map2.put("dhiraj", 19);
		map2.put("debo", 81);
		for(String key1:map2.keySet()){
			System.out.println("key="+key1);
		}
		for(Integer value1:map2.values()){
			System.out.println("value="+value1);
		}
		
		//
		
		
	}

}
