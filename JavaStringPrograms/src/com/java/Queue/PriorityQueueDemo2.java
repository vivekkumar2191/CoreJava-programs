package com.java.Queue;
import java.util.*;
public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values={1,3,4,5,7,6,8,9};
		int len=values.length;
       PriorityQueue<Integer> pq2=new PriorityQueue<Integer>();
       for(int x:values){
    	   pq2.offer(x);
       }
       System.out.println(pq2);
       for(int i=0;i<len;i++){
    	   System.out.println(pq2.poll()+" ");
       }
       System.out.println("String as input");
       String[] str={"vivek","Debo","Ritesh","Dhiraj","Parbhat"};
       int length=str.length;
       PriorityQueue<String> spq2=new PriorityQueue<String>();
       for(String s:str){
    	   spq2.offer(s);
    	   
       }
       System.out.println(spq2);
       for(int i=0;i<length;i++){
    	   System.out.println(spq2.poll()+" ");
    	   
       }
       System.out.println(spq2.peek());
	}
	

}
