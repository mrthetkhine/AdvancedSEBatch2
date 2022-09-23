package com.turing.se.cleancode2.solid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExplanatoryTest {

	@Test
	public void testStringUpperCase()
	{
		String original = "hello";
		String result =  original.toUpperCase();
		
		assertEquals("HELLO",result,"String uppercase should change string to all uppercase");
	}
	@Test
	public void anotherTest()
	{
		System.out.println("Test case anotherTest run");
	}
}
