//java program to split string on the basis of special character digit 
package com.java.programs;
import java.util.*;
import java.io.*;
public class DublicateWordFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to split");
		String str=sc.next();
		System.out.println(str);
		//String []ch=str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		String []ch=str.split("([^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z]))");
		for(int i=0;i<ch.length;i++){
			
			System.out.print(ch[i]);
		}
		
		

	}

}
