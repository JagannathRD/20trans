package com.xworkz.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ByteInputStream {
	public static void main(String[] args) {
		System.out.println("mms");
		
		File ioFile= new File("F:\\Zava\\IOFile\\new\\Iofile.txt");
		FileInputStream in=null;
		try {
			in=new FileInputStream(ioFile);
			System.out.println((char)in.read());
			
			byte[] input= new byte[30];
			in.read(input);
			
			for(byte a:input)
				System.out.print((char)a);
			
			int j=0;
			while((j=in.read())!=-1){
				System.out.println((char)j);
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(in!=null)
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
		
		
		
		System.out.println("mme");
	}
}
