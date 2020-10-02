package com.xworkz.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharInputStream {

	public static void main(String[] args) {
		System.out.println("mms");
		
		try {
			FileReader in =new FileReader("F:\\Zava\\IOFile\\new\\CharFile.txt");
			char[] charArr=new char[20];
			in.read(charArr);
			
			for(char c:charArr)
				System.out.print(c);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("mme");
	}

}
