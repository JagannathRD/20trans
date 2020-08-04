package com.xworkz.exceptionalhandling;

import java.io.File;
import java.io.FileInputStream;

public class TryFinally {

	public static void main(String[] args) {
		System.out.println("MMS");
		File file;
		FileInputStream in;
		try{
			file=new File("c://project");
			in =new FileInputStream(file);
			String str=null;
			str.length();
		}catch(Exception e){
			System.out.println("Exception has occured");
		}finally{
			System.out.println("must execute statements...");
			//in.close();
		}
		System.out.println("MME");
	}

}
