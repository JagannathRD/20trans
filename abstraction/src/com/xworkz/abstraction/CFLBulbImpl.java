package com.xworkz.abstraction;

public class CFLBulbImpl implements ISwitch{

	@Override
	public void sOn() {
		System.out.println("CFL bulb is on ");
		
	}

	@Override
	public void sOff() {
		System.out.println("CFL bulb is off");
		
	}

}
