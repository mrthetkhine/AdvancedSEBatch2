package com.turing.se.cleancode2.tdd.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

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
		System.out.println("Input "+input.startsWith("//["));
		if(input.startsWith("//["))
		{
			//System.out.println("Here");
			String delimiterReg = "\\[(.+)\\]";
			Pattern pattern = Pattern.compile(delimiterReg);
			Matcher matcher = pattern.matcher(input);
			
			
			if(matcher.find())
			{
				String delimiter = matcher.group(1);
				System.out.println("Delimiter>> "+delimiter);
				CharSequence charSeq = delimiter;
				CharSequence comma = ",";
				String inputAfterDeilimiter = input.replace(charSeq, comma);
				System.out.println("inputAfterDeilimiter "+inputAfterDeilimiter);
				return sumMultipleString(inputAfterDeilimiter);
			}
			else
			{
				return sumMultipleString(input);
			}
		}
		else
		{
			char customDelimiter = input.charAt(CUSTOM_DELIMITER_ESCAPE.length()); 
			
			int delimiterAndNewLine = 2;
			String inputAfterDeilimiter = input.substring(CUSTOM_DELIMITER_ESCAPE.length()+delimiterAndNewLine);
			inputAfterDeilimiter = inputAfterDeilimiter.replace(customDelimiter, ',');
			
			return sumMultipleString(inputAfterDeilimiter);
		}
		
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
