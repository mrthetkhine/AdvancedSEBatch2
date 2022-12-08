package com.turing.se.cleancode2.tddcycle;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.turing.se.cleancode2.tddcycle.OurMath;

public class TrigulateTest {
	
	@Test
	public void testSum() { 
		assertEquals(4, OurMath.plus(3, 1));
		assertEquals(7, OurMath.plus(3, 4));
	}
}
