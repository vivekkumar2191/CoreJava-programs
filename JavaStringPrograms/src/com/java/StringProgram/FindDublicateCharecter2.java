package com.java.StringProgram;

public class FindDublicateCharecter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="W3schools";
		char[] ch=str.toCharArray();
		System.out.println("dublicate charecters are:");
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(ch[i]==ch[j]){
					System.out.println(ch[i]);
					count++;
					break;
				}
			}
		}

	}

}
