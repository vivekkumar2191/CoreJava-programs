package com.java.MapImp;
import java.util.*;
public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new LinkedHashMap();
		System.out.println(map);
		map.put("eid",new Integer(99));
		map.put("name","vivek");
		map.put("mobile",new Long(8987234277L));
		map.put("valid", new Boolean(true));
		System.out.println("Size:"+map.size());
		System.out.println("IsEmpty:"+map.isEmpty());
		System.out.println("ContainsKey()");
		System.out.println(map.containsKey("eid"));	
		System.out.println(map.containsKey("email"));
		System.out.println("containsValue()");
		System.out.println(map.containsValue("vivek"));
		System.out.println(map.containsValue(new Integer(99)));
		System.out.println(map.containsValue("SD"));

	}

}
