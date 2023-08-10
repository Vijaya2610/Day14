package com.threadutil;

import java.io.*;
import java.util.Scanner;

class BugDetails {
    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(new InputStreamReader(System.in));
            
            System.out.print("Enter developer name: ");
            String developerName = scanner.nextLine();
            
            System.out.print("Enter bug number: ");
            String bugNumber = scanner.nextLine();
            
            System.out.print("Enter bug description: ");
            String bugDescription = scanner.nextLine();
            
            String data = "Developer Name: " + developerName + "\nBug Number: " + bugNumber + "\nBug Description: " + bugDescription;
            
            FileOutputStream fos = new FileOutputStream("buginfo.dat");
            fos.write(data.getBytes());
            fos.close();
            
        } catch (IOException e) {
        	System.out.println(e);
        }
    }
}
