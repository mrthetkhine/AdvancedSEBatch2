package com.turing.se.cleancode2.designpattern.decorator;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DecoratorDemo {
	public static void main(String[]args)
	{
		    Logger lg = new HTMLDecorator(new TimeDecorator(new BasicLogger()));
	        //Logger lg = new HTMLDecorator((new BasicLogger()));
	        String msg = lg.log("LogString");
	        System.out.println(msg);
	        
	       
	}
}
