package com.printit.controller;

public class PriceDecorator implements IPriceComponent{

	private IPriceComponent pcomponent;
	
	public PriceDecorator(IPriceComponent pc)
	{
		pcomponent = pc;
	}
	
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pcomponent.getPrice();
	}
	
	

}
