package com.turing.se.cleancode2.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {
	public static void main(String[]args)
	{
		User user = new User();
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.data"))) 
		{
			user = (User)in.readObject();
			System.out.println("User "+user.name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User "+user);
	}
}
