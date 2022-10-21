package com.turing.se.cleancode2.designpattern.observer;

//Model
//Source
public interface Publisher {
	 public void attach(Subscriber subscriber);
	 public void deattach(Subscriber subscriber);
	 public void change(String message);
}
