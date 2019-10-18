package com.java.MapImp;
import java.util.*;
public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map3=new LinkedHashMap();
		map3.put("eid",new Integer(109));
		map3.put("name", "Vivek kumar");
		map3.put("mobile",new Long(8983427701L));
		map3.put("valid", new Boolean(true));
		System.out.println(map3);
		System.out.println("removeId()"+map3.remove("eid"));
		System.out.println(map3);
		System.out.println("put-mobile:"+map3.put("mobile",new Long(8982437455L) ));
		System.out.println(map3);
		System.out.println("get()");
		System.out.println("name:"+map3.get("name"));
		System.out.println("email:"+map3.get("email"));
		System.out.println("mobile:"+map3.get("mobile"));

	}

}
