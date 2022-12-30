package com.turing.se.cleancode2.tdd.kata;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculatorTest {

	Calculator cal = new Calculator();
	
	
	@Test
	public void testEmptyStringShouldReturnZero()
	{
	
		String input = "";
		int result = cal.add(input);
		
		assertEquals(0, result);
	}
	static Stream<Arguments> commaSeperateNumberProvider() {
	       return Stream.of(
	               arguments("1", 1),
	               arguments("1,2", 3),
	               arguments("0,5", 5),
	               arguments("1,20,15", 36),
	               arguments("10,5,100", 115)
	               
	       );
	}
	@ParameterizedTest
	@MethodSource("commaSeperateNumberProvider")
	public void testMultiple(String input,int expectedResult)
	{
		
		int result = cal.add(input);
		
		assertEquals(expectedResult, result,"Excepted "+expectedResult+" but got "+ result);
	}
	
	static Stream<Arguments> inputWithNewLineProvider() {
	       return Stream.of(
	               arguments("1\n2,3", 6),
	               arguments("1\n3\n2,3", 9),
	               arguments("1,\n", 1)
	             
	       );
	}
	@ParameterizedTest
	@MethodSource("inputWithNewLineProvider")
	public void testWithNewLine(String input,int expectedResult)
	{
		int result = cal.add(input);
		
		assertEquals(expectedResult, result,"Excepted "+expectedResult+" but got "+ result);
	}
	static Stream<Arguments> inputWithDelimiterProvider() {
	       return Stream.of(
	               arguments("//;\n1;2", 3),
	               arguments("//;\n1;2;3", 6),
	               arguments("//*\n1*2,5", 8)
	             
	       );
	}
	@ParameterizedTest
	@MethodSource("inputWithDelimiterProvider")
	public void testWithDelimiter(String input,int expectedResult)
	{
		int result = cal.add(input);
		
		assertEquals(expectedResult, result,"Excepted "+expectedResult+" but got "+ result);
	}
	
	@Test
	public void testNegativeStringShouldThrowException()
	{	
		String input = "-2,3";
		RuntimeException exception = assertThrows(RuntimeException.class, ()->{
			int result = cal.add(input);
		});
		assertEquals(Calculator.NEGATIVES_NOT_ALLOWED, exception.getMessage());
	}
	@Test
	public void testNumberGreaterThan1000()
	{	
		String input = "1001,3";
		int result = cal.add(input);
		assertEquals(3, result);
	}
	
	
	static Stream<Arguments> inputWithMulipleLengthDelimiterProvider() {
	       return Stream.of(
	               arguments("//[***]\n1***2***3", 6)
	             
	       );
	}
	
	@ParameterizedTest
	@MethodSource("inputWithMulipleLengthDelimiterProvider")
	public void testWithMultipleLengthDelimiter(String input,int expectedResult)
	{
		int result = cal.add(input);
		
		assertEquals(expectedResult, result,"Excepted "+expectedResult+" but got "+ result);
	}
	
	static Stream<Arguments> inputWithMulipleDelimiterProvider() {
	       return Stream.of(
	               arguments("//[*][%]\n1*2%3", 6),
	               arguments("//[**][%]\n1**2%3", 6),
	               arguments("//[*(][%]\n1*(2%3", 6)
	             
	       );
	}
	@ParameterizedTest
	@MethodSource("inputWithMulipleDelimiterProvider")
	public void testWithMulipleDelimiterProvider(String input,int expectedResult)
	{
		int result = cal.add(input);
		
		assertEquals(expectedResult, result,"Excepted "+expectedResult+" but got "+ result);
	}
	
}
