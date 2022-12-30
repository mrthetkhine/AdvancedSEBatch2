package com.turing.se.cleancode2.tdd.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	private static final String CUSTOM_DELIMITER_PREFIX = "//[";
	private static final String CSUTOM_DELIMITER_REG = "\\[[^\\]]+\\]";
	private static final int UPPER_LIMIT = 1000;
	private static final int LOWER_LIMIT = 0;
	public static final String NEGATIVES_NOT_ALLOWED = "negatives not allowed";
	private static final String NORMAL_DELIMITER = "(,|\n)";
	private static final String CUSTOM_DELIMITER_ESCAPE = "//";

	public int add(String input) {
		if(input.isEmpty())
		{
			return 0;
		}
		else if(input.startsWith(CUSTOM_DELIMITER_ESCAPE))
		{
			return sumWithCustomDelimiter(input);
		}
		else
		{
			return sumMultipleString(input);
		}
						
	}

	private int sumWithCustomDelimiter(String input) {
		if(input.startsWith(CUSTOM_DELIMITER_PREFIX))
		{
			return sumWithMultipleCharDelimiter(input);
		}
		else
		{
			return sumWithSingleCharDelimiter(input);
		}
		
	}

	private int sumWithSingleCharDelimiter(String input) {
		char customDelimiter = input.charAt(CUSTOM_DELIMITER_ESCAPE.length()); 
		
		int delimiterAndNewLine = 2;
		String inputAfterDeilimiter = input.substring(CUSTOM_DELIMITER_ESCAPE.length()+delimiterAndNewLine);
		inputAfterDeilimiter = inputAfterDeilimiter.replace(customDelimiter, ',');
		
		return sumMultipleString(inputAfterDeilimiter);
	}

	private int sumWithMultipleCharDelimiter(String input) {
		
		Pattern pattern = Pattern.compile(CSUTOM_DELIMITER_REG);
		Matcher matcher = pattern.matcher(input);
		
		int indexOfNewLine = input.indexOf("\n"); 
		String data = input.substring( indexOfNewLine+1);
		
		while(matcher.find())
		{
			String delimiterGroup = matcher.group();
			
			String delimiter = delimiterGroup.substring(1,delimiterGroup.length()-1);
			String comma = ",";
			data = data.replaceAll(Pattern.quote(delimiter), comma);
			
		}
		return sumMultipleString(data);
	}

	private int sumMultipleString(String input) {
		int total = 0;
		String[] numberString = input.split(NORMAL_DELIMITER);
		
		for(String num : numberString)
		{
			Integer number =Integer.parseInt(num);
			number = checkLimit(number);
			total += number;
		}
		
		return total;
	}

	private Integer checkLimit(Integer number) {
		if(number < LOWER_LIMIT)
		{
			throw new RuntimeException(NEGATIVES_NOT_ALLOWED);
		}
		else if(number >UPPER_LIMIT)
		{
			number = 0;
		}
		return number;
	}

}
