package com.xworkz.threads;

public class TablesOfNine extends Thread{
@Override
public void run() {
	TablesOfGivenNumber tablesOfGivenNumber = new TablesOfGivenNumber();
	tablesOfGivenNumber.multiplesOfNumber(9);
}
}
