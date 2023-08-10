package com.threadutil;

import java.io.*;

public class ReadFromConsole {

    public static void main(String[] args) {

    	InputStream in=System.in;
		try {
			byte[] bt=new byte[20];
			in.read(bt);
			String str=new String(bt);
			System.out.println("You have written "+str);
			
		}
		catch(IOException e)
		{System.out.println(e);
		}
       }
   }
