package com.printit.view;

import com.printit.controller.IPriceComponent;
import com.printit.controller.PriceConcreteComponent;
import com.printit.controller.PriceDecorator;

public class SizeA0ConcreteDecorator extends PriceDecorator{
	
	 public SizeA0ConcreteDecorator(IPriceComponent pc) {
		super(pc);
		// TODO Auto-generated constructor stub
	}

	public double getPrice()
	 {
		double price = super.getPrice();
		return price + 8;
	 }

}
