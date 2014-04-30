package com.printit.controller;

public interface ChainHandler {
	
	public void handleRequest(int x, int y);
	public void setSuccessor(ChainHandler next);

}
