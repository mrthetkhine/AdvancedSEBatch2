package com.turing.se.cleancode2.tdd;

import static org.mockito.Mockito.atLeast;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CarTest {

	@Mock
	Engine engine;
	
	@Test
	void engineShouldStartWhenCarStart()
	{
		Car car = new Car(engine);
		car.start();
		
		Mockito.verify(engine,atLeast(1)).start();
	}
}
