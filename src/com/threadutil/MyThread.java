package com.threadutil;

class MyChildThread extends Thread{
	
	public void run() {
		System.out.println("child thread has started");
	}
}
public class MyThread {

	public static void main(String[] args) {
		
		Thread th=Thread.currentThread();
		System.out.println(th.getName());

	}

}
