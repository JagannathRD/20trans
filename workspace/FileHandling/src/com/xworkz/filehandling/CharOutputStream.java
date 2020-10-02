package com.xworkz.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharOutputStream {

	public static void main(String[] args) {
	System.out.println("mms");
	
		File fileOut= new File("F:\\Zava\\IOFile\\new\\CharFile.txt");
	
		try {
			FileWriter out= new FileWriter(fileOut);
			out.write("hello there");
			out.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	
	System.out.println("mme");
	}

}
