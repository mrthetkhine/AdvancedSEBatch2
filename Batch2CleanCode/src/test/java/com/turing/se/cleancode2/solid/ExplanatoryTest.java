package com.turing.se.cleancode2.solid;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.turing.se.cleancode2.exception.CheckExceptionDemo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExplanatoryTest {

	int count =0;
	@BeforeAll
	static void setup() {
	    log.info("@BeforeAll - executes once before all test methods in this class");
	}
	@AfterAll
	static void done() {
	    log.info("@AfterAll - executed after all test methods.");
	}
	@BeforeEach
	void init() {
	    log.info("@BeforeEach - executes before each test method in this class");
	}
	@AfterEach
	void tearDown() {
	    log.info("@AfterEach - executed after each test method.");
	}

	
	@DisplayName("Test string uppercase function return uppercase")
	@Test
	public void testStringUpperCase()
	{
		count ++;
		log.info("Counter "+count);
		String original = "hello";
		String result =  original.toUpperCase();
		
		log.info("testStringUpperCase test case");
		assertEquals("HELLO",result,"String uppercase should change string to all uppercase");
		//assertEquals(6,result.length());
	}
	//@Disabled("Not implemented yet")
	@Test
	public void anotherTest()
	{
		count ++;
		log.info("Counter "+count);
		log.info("anotherTest test case");
		//assumeTrue(5 >= 1);
		System.out.println("Test case anotherTest run");
	}
	@Test
	public void testException()
	{
		CheckExceptionDemo demo = new CheckExceptionDemo();
		Exception exception = assertThrows(Exception.class,()->{
			demo.process();
		});
		assertEquals("Unknown exception",exception.getMessage());
	}
}
