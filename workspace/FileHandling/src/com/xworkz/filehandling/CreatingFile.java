package com.xworkz.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) {
		System.out.println("mms");
		
		File ioFile= new File("F:\\Zava\\IOFile\\new\\Iofile.txt");
		
		try {
			ioFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("mme");

	}

}
