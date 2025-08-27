package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseClassExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// 1st 
		// source : keyboard 
		// destination : console 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the text");
//		String msg = dis.readLine();
//		ps.println(msg);
		
//		// 2nd 
//				// source : keyboard 
//				// destination : file  
//				DataInputStream dis = new DataInputStream(System.in);
//				//FileOutputStream fos = new FileOutputStream("abc.txt");	// override the file 
//				FileOutputStream fos = new FileOutputStream("abc.txt",true);	// append the data 
//				System.out.println("Enter the text");
//				int ch;
//				while((ch=dis.read()) != '@') {
//					fos.write(ch);
//				}
//				System.out.println("file created");
		
		// 3rd 
		// source : file 
		// destination : file  
		FileInputStream fis = new FileInputStream("abc.txt");
		//FileOutputStream fos = new FileOutputStream("abc.txt");	// override the file 
		FileOutputStream fos = new FileOutputStream("xyz.txt",true);	// append the data 
		
		int ch;
		while((ch=fis.read()) != -1) { // EOF End of the file 
			fos.write(ch);
		}
		System.out.println("file copied");
	}

}
