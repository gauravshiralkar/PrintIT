package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IPriceComponent;
import com.printit.controller.IScreen;
import com.printit.controller.PriceConcreteComponent;

public class Style1 implements IScreen, ChainHandler{
	ChainHandler successor;
	AppController appController;
	public Style1(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of Style1");
		if (x >= 34 && y  >= 252						//Corporate Event
				&& x <= 149 && y <= 367) {
			System.out.println("**********Style1************");
			setPrice();
			appController.setCurrentScreen(appController.getUploadScreen());
		}
		else{
			if (successor != null){
				successor.handleRequest(x, y);
			}
			else{
				System.out.println("Not my req");
			}
		}

		
	}

	@Override
	public void setSuccessor(ChainHandler next) {
		// TODO Auto-generated method stub
		this.successor = next;
		
	}
	
	public void setPrice()
	{
		IPriceComponent ipc = new Style1ConcreteDecorator(new PriceConcreteComponent());
		appController.setPrice(ipc.getPrice());
	}
	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(PApplet applet) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		
	}

}
