package com.java.Queue;
import java.util.*;
public class PriorityQueueDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Queue<String> q3=new PriorityQueue<String>();
      q3.add("debo");
      q3.add("Vijay");
      q3.add("Dibyanshu");
      q3.add("Ritesh");
      q3.offer("R.p");
      q3.offer("debo");
      System.out.println(q3);
      System.out.println("size:"+q3.size());
      System.out.println("Peek:" +q3.peek());
      System.out.println("size:"+q3.size());
      System.out.println("Poll:" +q3.poll());
      System.out.println("size:"+q3.size());
      System.out.println(q3);
      System.out.println("Element:"+q3.element());
      System.out.println("size:"+q3.size());
      
	}

}
