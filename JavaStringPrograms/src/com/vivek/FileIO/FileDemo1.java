package com.vivek.FileIO;

import java.io.*;

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("demo1.txt");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());

	}

}
