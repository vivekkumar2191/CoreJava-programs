package com.java.CollectionMap;

import java.util.HashSet;
import java.util.*;


public class HashSetDemo {

	public static void main(String[] args) {
		// create HashSet
		HashSet<String> hset=new HashSet<String>();
		hset.add("vivek");
		hset.add(null);
		hset.add(null);
		hset.add("debo");
		hset.add("ritesh");
		hset.add("vivek");
	
	   System.out.println(hset);
		System.out.println("HashSet Contain");
		for(String temp:hset){
			System.out.println(temp);
		}
		//Iterating hashSet by using iterator
		
		System.out.println("Iteratoring hash Set");
		Iterator itr=hset.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//printing hashSet by using forEach() loop in java
		System.out.println("OutPut printed by forEach loop");
		hset.forEach(System.out::println);
		

	}

}
