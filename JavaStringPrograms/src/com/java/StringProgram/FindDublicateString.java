package com.java.StringProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class FindDublicateString {
	private static Scanner sc;
	 static BufferedReader br=null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the String u want to serach:");
		sc=new Scanner(System.in);
		String str=sc.nextLine();
		br=new BufferedReader(new FileReader("D:\\hello.txt"));
		String s1=br.readLine();
	    Map<String,Integer> map1=new HashMap<String,Integer>();
	    /*for(String st1:s1){
	    	
	    }
	*/
		

	}

}
