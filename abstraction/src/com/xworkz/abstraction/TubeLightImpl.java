package com.xworkz.abstraction;

public class TubeLightImpl implements ISwitch {

	@Override
	public void sOn() {
		System.out.println("Tubelight on");
		
	}

	@Override
	public void sOff() {
	System.out.println("TubeLight off");
		
	}

}
