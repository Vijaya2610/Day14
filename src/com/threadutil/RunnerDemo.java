package com.threadutil;

class MyRunner implements Runnable
{
	public void run() {
		Thread th=Thread.currentThread();
		System.out.println(th.getName()+" is running");
	}
}
public class RunnerDemo {

	public static void main(String[] args) {
		
		MyRunner myRunner=new MyRunner();
		
		Thread th1=new Thread(myRunner);
		Thread th2=new Thread(myRunner);
		th1.setName("child thread 1");
		th2.setName("child thread 2");
		th1.start();
		th2.start();

	}

}
