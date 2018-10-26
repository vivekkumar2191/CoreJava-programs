package com.java.MultiThreadindProgram;
class ThreadB extends Thread{
	int total=0;
	public void run(){
		
		System.out.println("child thread start calculation");
		for(int i=0;i<100;i++){
			total=total+i;
		}
	}
	
	
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB thb=new ThreadB();
		thb.start();
		System.out.println("main thread is running");
		System.out.println(thb.total);
	}

}
