package com.threadutil;

import java.io.*;

public class ExerciseBuffer {
    public static void main(String[] args) {
        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String data = "Developer Name:<your name> \nBug No:<Any Number>\nBud Description:<Description Text>";
            byte[] bytes = data.getBytes();
            bufferedOutputStream.write(bytes);

            bufferedOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("data.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] buffer = new byte[1024];
            int bytesRead = bufferedInputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
            System.out.println(readData);

            bufferedInputStream.close();
        } catch (IOException e) {
        	System.out.println(e);
        }
    }
}