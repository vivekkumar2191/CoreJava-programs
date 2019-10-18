package com.java.MapImp;
import java.util.*;

public class MapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map4=new LinkedHashMap();
		map4.put("eid",new Integer(109));
		map4.put("name", "vivek");
		map4.put("mobile", new Long(9098989234L));
		map4.put("valid", new Boolean(true));
		System.out.println(map4);
		System.out.println("** \n Keys **");
		Set keys=map4.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()){
			Object key=itr.next();
			System.out.println(key);
		}
		System.out.println("**values**");
		Collection col=map4.values();
		Iterator itr1=col.iterator();
		while(itr1.hasNext()){
			Object val=itr1.next();
			System.out.println(val);
		}
		
	}

}
