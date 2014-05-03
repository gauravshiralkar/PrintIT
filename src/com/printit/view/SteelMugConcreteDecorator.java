package com.printit.view;

import com.printit.controller.IPriceComponent;
import com.printit.controller.PriceDecorator;

public class SteelMugConcreteDecorator extends PriceDecorator{

	public SteelMugConcreteDecorator(IPriceComponent pc) {
		super(pc);
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice()
	{
		double price = super.getPrice();
		return price + 4;
	}

}
