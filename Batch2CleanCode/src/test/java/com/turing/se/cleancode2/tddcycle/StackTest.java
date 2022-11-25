package com.turing.se.cleancode2.tddcycle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackTest {

	Stack stack = new Stack();
	@Test
	public void testPushWhenStackIsEmpty()
	{
		//Arrange
		
		//Act
		stack.push(10);
		
		//Assert
		assertEquals(10, stack.pop());
	}
	@Test
	public void testPushForTwoItemWhenStackIsEmpty()
	{
		
		//Act
		stack.push(10);
		stack.push(20);
		
		//Assert
		assertEquals(20, stack.pop());
		assertEquals(10, stack.pop());
	}
	@Test
	public void testPushToMaxSizeStack()
	{
		for(int i=0;i<Stack.SIZE;i++)
		{
			//Act
			stack.push(i);
			
		}
		for(int i=Stack.SIZE-1;i<=0;i--)
		{
			//Act
			assertEquals(i, stack.pop());	
		}
	}
	@Test
	public void testStackShouldTrowStackOverflowExceptionWhenFull()
	{
		//Arrange
		for(int i=0;i<Stack.SIZE;i++)
		{
			stack.push(i);		
		}
		//Act
		StackOverflowException exception = assertThrows(StackOverflowException.class, ()->{
			stack.push(0);
		});
		assertEquals(Stack.STACK_IS_FULL,exception.getMessage());
		
	}
	
	@DisplayName("Stack should throw stack is empty exception when calling pop on empty stack")
	@Test
	public void testStackShouldThrowStackEmptyException()
	{
		StackEmptyException exception = assertThrows(StackEmptyException.class, ()->{
			stack.pop();
		});
		assertEquals(Stack.STACK_IS_EMPTY,exception.getMessage());
	}
}
