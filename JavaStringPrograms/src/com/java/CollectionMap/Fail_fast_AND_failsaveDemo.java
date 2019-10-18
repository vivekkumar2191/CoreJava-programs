/*when we are going to insert some value in HashMap,HashSet and ArrayList while iterarting the we got 
 * ConcurrentModificationException that is called failfast and when I using concuurentHashMap,concurrentHashset,
 * CopyOnWriteArrayList then that exception is called fail save*/
package com.java.CollectionMap;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;

public class Fail_fast_AND_failsaveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<String,Integer> map=new HashMap<String,Integer>();
		ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<String,Integer>();
		map.put("arman", 12);
		map.put("Debo", 13);
		map.put("Ritesh", 22);
		map.put("dhiraj",23);
		System.out.println(map.size());
		System.out.println(map.containsKey("Debo"));
		Iterator<Entry<String,Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, Integer> pair=(Map.Entry<String, Integer>)itr.next();
			System.out.println(pair.getKey()+":"+pair.getValue());
			
			map.put("Prabhat",34);
		}
		
	}

}
