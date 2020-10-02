package com.xworkz.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) {
		System.out.println("mms");

		File ioFile= new File("F:\\Zava\\IOFile\\new\\Iofile.txt");
		FileOutputStream out=null;
		try {
			 out=new FileOutputStream(ioFile);
			out.write(65);
			
			String str= "welcome to the world";
			byte[] strbytes=str.getBytes();
			out.write(strbytes);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(out!=null)
				try {
					out.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
		
		
		System.out.println("mme");
	}

}
