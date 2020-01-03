package com.java.StringProgram;

public class StringReverve {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String st="Vivek";
		char[] a=st.toCharArray();
		char[] t1=null;
		String temp=null;
		for(int i=(a.length-1);i<a.length;i--){
            for(int j=0;j<a.length;j++){
            	t1[j]=a[i];
			System.out.println("t1 value:"+t1[j]);
			
            }
	
			System.out.println("reverse string"+temp);
		}   
        
	}

}
