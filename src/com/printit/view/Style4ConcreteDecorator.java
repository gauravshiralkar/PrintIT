package com.printit.view;

import com.printit.controller.IPriceComponent;
import com.printit.controller.PriceDecorator;

public class Style4ConcreteDecorator extends PriceDecorator{

	public Style4ConcreteDecorator(IPriceComponent pc) {
		super(pc);
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice()
	{
		double price = super.getPrice();
		return price + 6;
	}

}
