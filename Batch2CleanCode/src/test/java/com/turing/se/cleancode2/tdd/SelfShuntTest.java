package com.turing.se.cleancode2.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SelfShuntTest extends Engine{

	boolean engineStart = false;
	public void start()
	{
		this.engineStart = true;
	}
	@Test
	public void testEngineShouldStartWhenCarStart()
	{
		System.out.println("Test case executed");
		Car car = new Car(this);
		
		car.start();
		assertTrue(this.engineStart);
	}
}
