package com.vivek.FileIO;
import java.io.*;

public class FileDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File f=new File("demo.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());

	}

}
