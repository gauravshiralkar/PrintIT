package com.printit.view;

import com.printit.controller.PriceDecorator;
import com.printit.controller.IPriceComponent;;

public class PlasticMugConcreteDecorator extends PriceDecorator{

		public PlasticMugConcreteDecorator(IPriceComponent pc) {
		super(pc);
		// TODO Auto-generated constructor stub
	}

		private double price;
		
		 public double getPrice()
		 {
			price = super.getPrice();
			return price + 2;
		 }

	}


