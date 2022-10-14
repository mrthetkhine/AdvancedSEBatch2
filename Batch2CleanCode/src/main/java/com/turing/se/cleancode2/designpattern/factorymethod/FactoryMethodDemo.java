package com.turing.se.cleancode2.designpattern.factorymethod;

interface Connection
{
	void open();
	void close();
}

class DriverManager 
{
	static Connection getConnection(String type)throws Exception
	{
	
		Class clazz = Class.forName(type);
		return (Connection) clazz.newInstance();
	}
}
public class FactoryMethodDemo {
	public static void main(String[]args)
	{
		try {
			Connection con = DriverManager.getConnection("com.turing.se.cleancode2.designpattern.factorymethod.OracleConnection");
			
			con.open();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
