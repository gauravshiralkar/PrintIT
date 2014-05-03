package com.printit.view;

import com.printit.controller.IPriceComponent;
import com.printit.controller.PriceDecorator;

public class GlassMugConcreteDecorator extends PriceDecorator{

	private double price;
	public GlassMugConcreteDecorator(IPriceComponent pc) {
		super(pc);
		// TODO Auto-generated constructor stub
	}
	 public double getPrice()
	 {
		price = super.getPrice();
		return price + 3;
	 }

}
