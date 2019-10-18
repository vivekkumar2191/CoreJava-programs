package com.java.collection.Program;
import java.util.*;

public class CollectionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection col=new ArrayList();
		col.add("vivek");
		col.add("kumar");
		col.add("debo");
		col.add("pati");
	Object[] obj=col.toArray();
	System.out.println(obj);
	for(int i=0;i<obj.length;i++){
		System.out.println(obj[i]);
		obj[i]="jlc";
	}
	System.out.println(col);

	}

}
