package com.threadutil;

class UserDetailsTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000); 
            String userId = "123"; 
            System.out.println("Hello user " + userId);
        } catch (InterruptedException e) {
            System.out.println("user is ended");
        }
    }
}

class CountTask implements Runnable {
	
    private final Thread userDetailsThread;

    public CountTask(Thread userDetailsThread) {
        this.userDetailsThread = userDetailsThread;
    }

    @Override
    public void run() {
        while (userDetailsThread.isAlive()) {
            try {
                Thread.sleep(2000); 
                System.out.println("Count: ...");
            } catch (InterruptedException e) {
            	System.out.println("count is ended");
            }
        }
    }
}
public class ThreadExample {
	
    public static void main(String[] args) {
    	
        Thread userDetailsThread = new Thread(new UserDetailsTask());
        Thread countThread = new Thread(new CountTask(userDetailsThread));

        userDetailsThread.start();
        countThread.start();

        try {
            userDetailsThread.join();
            countThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have completed.");
    }
}

