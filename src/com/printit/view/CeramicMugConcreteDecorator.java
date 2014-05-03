package com.printit.view;

import com.printit.controller.IPriceComponent;
import com.printit.controller.PriceDecorator;

public class CeramicMugConcreteDecorator extends PriceDecorator{

	public CeramicMugConcreteDecorator(IPriceComponent pc) {
		super(pc);
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice()
	{
		double price = super.getPrice();
		return price + 1;
	}

}
