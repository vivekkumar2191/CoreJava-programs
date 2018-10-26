package com.java.MultiThreadindProgram;
 
class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("1");
		try{
			this.wait();
			
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}
		System.out.println("2");
	}
	
	
}

public class MultiThreadingSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable myRun=new MyRunnable();
		Thread thread1=new Thread(myRun,"thread1");
		thread1.run();
	}


}
