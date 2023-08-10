package com.threadutil;

class UserDetailsThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000); 
            System.out.println("Hello user id: " + getUserId());
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
    private String getUserId() {
      
        return "user123";
    }
}

class CountThread extends Thread {
    @Override
    public void run() {
        while (!UserDetailsThread.currentThread().isAlive()) {
            System.out.println("Count: " + getCount());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            	System.out.println(e);
            }
        }
    }
    
    private int getCount() {
   
        return 0; 
    }
}

public class Main {
    public static void main(String[] args) {
        UserDetailsThread userDetailsThread = new UserDetailsThread();
        CountThread countThread = new CountThread();
        
        userDetailsThread.start();
        countThread.start();
    }
}