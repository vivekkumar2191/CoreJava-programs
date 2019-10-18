package com.java.LamdaExpression;
interface intern{
	public void sum(int a,int b);
}

public class DemoLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intern i=(a,b)->System.out.println("The sum is:"+(a+b));
			i.sum(12, 17);
	}

}
