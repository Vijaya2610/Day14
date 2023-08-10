package com.threadutil;

import java.io.*;
import java.util.Scanner;

class ReadBugDetails {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("buginfo.dat");
            Scanner scanner=new Scanner(new InputStreamReader(fis));
            
            String line;
            while ((line = scanner.nextLine()) != null) {
                System.out.println(line);
            }
            
            scanner.close();
        } catch (IOException e) {
        	System.out.println(e);
        }
    }
}