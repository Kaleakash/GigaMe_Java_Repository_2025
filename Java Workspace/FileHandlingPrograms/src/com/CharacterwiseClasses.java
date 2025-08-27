package com;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterwiseClasses {

	public static void main(String[] args) throws Exception{
		// Character wise classes 
		
		FileReader fr = new FileReader("D:\\Maven Plugins.txt");
		FileWriter fw = new FileWriter("info.docx");
		int ch;
		while((ch= fr.read()) != -1) {
			fw.write(ch);
			System.out.print(ch+" "+(char)ch);
		}
		fr.close();
		fw.close();
		System.out.println("character wise file copied example");
	}

}
