package com.printit.controller;

public interface IPassCode {
	public void pressedNumber(String input);
	public void backspace();
	public String getState();
}
