package com.xworkz.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFolder {

	public static void main(String[] args) {
		System.out.println("mms");

		File folder = new File("F:\\Zava\\IOFile");
		folder.mkdir();

		System.out.println("Creating Folder");
		System.out.println("Does folder exist? " + folder.exists());

		System.out.println("Can folder execute: " + folder.canExecute());
		System.out.println("folder readable " + folder.canRead());
		System.out.println("folder writeable " + folder.canWrite());

		try {
			System.out.println("Creates folder if path not exists " + folder.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(folder.delete());
		
		File folder2 = new File("F:\\Zava\\IOFile\\new");
		folder2.mkdirs();
		
		System.out.println("Is hidden "+folder.isHidden());
		System.out.println(folder2.getAbsolutePath());
		System.out.println(folder.isFile());
		System.out.println(folder.getName());
		System.out.println(folder.getParent());   

		System.out.println("mme");

	}

}
