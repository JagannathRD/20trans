package com.xworkz.threads;

public class Star extends Thread{
		public void run(){
			for(int i=1; i<=5;i++){
				for(int j=1; j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		}
