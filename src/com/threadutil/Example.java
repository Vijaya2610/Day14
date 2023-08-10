package com.threadutil;

class PrintNames implements Runnable
{ 
   private String[] names= {"Peter","Sam","Edgar","Mathew","Simond"};

 synchronized public void printArray() { 
   for(String s:names) 
   { 
	   System.out.println(s);
	   } 
   }
 public void run() {
     printArray();
 }
} 
public class Example {

	public static void main(String[] args) {
		PrintNames printNames = new PrintNames();
        Thread thread = new Thread(printNames);
        Thread thread1 = new Thread(printNames);
        thread.start();
        thread1.start();
    }
}


