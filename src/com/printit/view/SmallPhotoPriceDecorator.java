package com.printit.view;

import com.printit.controller.IPriceComponent;
import com.printit.controller.PriceDecorator;

public class SmallPhotoPriceDecorator extends PriceDecorator{

	public SmallPhotoPriceDecorator(IPriceComponent pc) {
		super(pc);
		// TODO Auto-generated constructor stub
	}
	public double getPrice()
	{
		double price = super.getPrice();
		return price + 2;
	}

}
