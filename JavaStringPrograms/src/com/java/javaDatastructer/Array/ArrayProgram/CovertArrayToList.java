package com.java.javaDatastructer.Array.ArrayProgram;
import java.util.*;
public class CovertArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Integer[] ar={12,14,71,81,92};
       for(int i=0;i<ar.length;i++){
       System.out.println(ar[i]);
       }
       List<Integer> l=Arrays.asList(ar);
       System.out.println(l);
	}

}
