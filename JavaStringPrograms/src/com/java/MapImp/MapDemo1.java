package com.java.MapImp;
import java.util.*;
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new LinkedHashMap();
		System.out.println(map);
		System.out.println("Size:" +map.size());
		System.out.println("IsEmpty:" +map.isEmpty());
		map.put("eid",new Integer(99));
		map.put("name","vivek");
		map.put("mobile", new Long(898882343));
		map.put("valid",new Boolean(true));
		System.out.println(map);
		System.out.println("Size:"+map.size());
		System.out.println("IsEmpty:"+map.isEmpty());
	}

}
