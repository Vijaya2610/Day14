package com.threadutil;

import java.io.PrintStream;

public class WriteToConsole {

	public static void main(String[] args) {
		
		try {
			PrintStream pout=System.out;
			pout.write("Hello World".getBytes());
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
