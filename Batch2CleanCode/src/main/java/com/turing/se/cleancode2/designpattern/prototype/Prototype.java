package com.turing.se.cleancode2.designpattern.prototype;

public interface Prototype extends Cloneable {
	Prototype reproduce()throws CloneNotSupportedException;
}
