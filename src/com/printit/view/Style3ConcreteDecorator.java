package com.printit.view;

import com.printit.controller.IPriceComponent;
import com.printit.controller.PriceDecorator;

public class Style3ConcreteDecorator extends PriceDecorator{

	public Style3ConcreteDecorator(IPriceComponent pc) {
		super(pc);
		// TODO Auto-generated constructor stub
	}
	public double getPrice()
	{
		double price = super.getPrice();
		return price + 5;
	}

}
