package com.turing.se.cleancode2.oop;
class Gateway
{
	public void process()
	{
		System.out.println("Gateway Process");
	}
}
class CBGateway extends Gateway
{
	public void process()
	{
		System.out.println("CBGateway Process");
	}
}
class KBZGateway extends Gateway
{
	public void process()
	{
		System.out.println("KBZGateway Process");
	}
}
public class PolymorphismDemo {
	
	
	public static void main(String[]args)
	{
		
		Gateway gateway = new KBZGateway();
		gateway.process();
		
		gateway = new CBGateway();
		gateway.process();
	}
}
