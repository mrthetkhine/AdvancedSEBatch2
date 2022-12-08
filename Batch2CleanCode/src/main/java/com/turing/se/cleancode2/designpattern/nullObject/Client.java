package com.turing.se.cleancode2.designpattern.nullObject;

public class Client {
	public static void main(String[]args)
	{
		Api api= new Api();
		NormalClass result = api.processApi(null);
		result.process();
	}
}
