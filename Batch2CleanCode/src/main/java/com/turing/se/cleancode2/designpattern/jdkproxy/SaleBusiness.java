package com.turing.se.cleancode2.designpattern.jdkproxy;

public class SaleBusiness implements BusinessLogic {

    @Override
    public void doAction() {
        System.out.println("Doing Sale");
    }

	@Override
	public void anotherAction() {
		System.out.println("Another action");
	}
    
}