package com.printit.controller;

public interface INumPad {

	public void NumDisplay();
	public void addDisplay(INumPad c);
	public void removeDisplay(INumPad c);
	public INumPad getDisplayNum(int i);
}
