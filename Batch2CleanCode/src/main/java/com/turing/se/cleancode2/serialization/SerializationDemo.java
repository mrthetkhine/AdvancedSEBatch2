package com.turing.se.cleancode2.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[]args)
	{
		User user = new User();
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.data"))) 
		{
			out.writeObject(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User "+user);
	}
}
