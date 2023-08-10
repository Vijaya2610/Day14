package com.threadutil;

import java.util.Scanner;

class UserInputThread extends Thread {
    private String name;
    private String email;

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter email: ");
        email = scanner.nextLine();
        System.out.println("Name:" + name + ", Email:" + email);
    }
}

class InterestCalculateThread extends Thread {
    @Override
    public void run() {
        double principal = 12000;
        double rate = 3;
        double time = 4;
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}

public class TryThread {
    public static void main(String[] args) {
        UserInputThread userInputThread = new UserInputThread();
        InterestCalculateThread interestCalcThread = new InterestCalculateThread();

        userInputThread.start();
        interestCalcThread.start();

    }
}
