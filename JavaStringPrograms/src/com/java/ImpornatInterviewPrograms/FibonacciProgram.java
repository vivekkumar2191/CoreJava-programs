package com.java.ImpornatInterviewPrograms;
import java.util.*;
public class FibonacciProgram {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number upto which fibonacci is print:");
		int number=new Scanner(System.in).nextInt();
       System.out.println("Fibonacci series upto number"+number+ "numbers:");
       for(int i=1;i<=number;i++){
    	   System.out.print(fibonacci2(i) +" ");
       }
	}
	public  static int  fibonacci2(int number){
		if(number==1 || number==2){
			return 1;
			
		}
		int n1=1,n2=1 ,fibonacci=1;
		for(int i=3;i<=number;i++){
			fibonacci=n1+n2;
			n1=n2;
			n2=fibonacci;
		}
	
		
		return fibonacci;
	}

}
