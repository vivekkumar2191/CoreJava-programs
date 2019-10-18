package com.java.MapImp;
import java.util.*;
public class MapDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Object> map5=new HashMap<String,Object>();
		map5.put("eid", new Integer(59));
		map5.put("name", "vivek");
		map5.put("mobile", new Long(8989898980L));
		for(Map.Entry<String,Object> entries:map5.entrySet()){
			System.out.println("key: " +entries.getKey()+" value: " +entries.getValue());
		}
		System.out.println("Iterating over key and Value using for each loop");
		for(String key:map5.keySet()){
			System.out.println("key=" +key);
		}
		for(Object val:map5.values()){
			System.out.println("value="+val);
		}
		
	}

}
