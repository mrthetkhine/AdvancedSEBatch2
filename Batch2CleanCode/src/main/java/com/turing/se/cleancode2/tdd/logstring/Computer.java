package com.turing.se.cleancode2.tdd.logstring;

public class Computer {
	HardDisk hardDisk;
	
	public Computer(HardDisk hardDisk)
	{
		this.hardDisk = hardDisk;
	}
	public void start()
	{
		this.hardDisk.init();
		this.hardDisk.readBootSector();
		this.hardDisk.loadOS();
	}
}
