package com.turing.se.cleancode2.designpattern.nullObject;

public class Api {
	public NormalClass processApi(String data)
	{
		if(data ==null)
		{
			return new EmptyNormalClass();
		}
		else
		{
			return new NormalClass();
		}
	}
}
