package com.threadutil;

import java.io.*;
import java.io.IOException;

import java.io.*;
public class OutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs= new FileOutputStream("myfile.txt");
			String str="Hello World";
			
			byte[] bt=str.getBytes();
			
			fs.write(bt);
			fs.flush();
			fs.close();
		}
		catch (IOException ex)
		{System.out.print("IO error"+ex);
		}
	
		}
	}
