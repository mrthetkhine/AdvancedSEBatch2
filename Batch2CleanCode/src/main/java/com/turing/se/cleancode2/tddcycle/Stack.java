package com.turing.se.cleancode2.tddcycle;

public class Stack {

	public static final String STACK_IS_FULL = "Stack is full";
	public static final String STACK_IS_EMPTY = "Stack is empty";
	public static final int SIZE = 10;
	private static final int INITIAL_INDEX = -1;
	
	private int []items = new int[SIZE];
	private int top = INITIAL_INDEX;
	
	public void push(int i){
		if( top < SIZE-1)
		{
			this.items[++top] = i;
		}
		else
		{
			throw new StackOverflowException(STACK_IS_FULL);
			
		}
		
	}

	public int pop() {
		if(top == INITIAL_INDEX)
		{
			throw new StackEmptyException(STACK_IS_EMPTY);
		}
		else
		{
			return this.items[top--];
		}
			
	}

}
