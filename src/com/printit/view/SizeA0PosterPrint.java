package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IPriceComponent;
import com.printit.controller.IScreen;
import com.printit.controller.PriceConcreteComponent;

public class SizeA0PosterPrint implements IScreen, ChainHandler{


	ChainHandler successor;
	AppController appController;
	public SizeA0PosterPrint(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of SizeA0PosterPrint");
		if (x >= 38 && y  >= 217						
				&& x <= 154 && y <= 390) {
			System.out.println("**********Size A0************");
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
		IPriceComponent ipc = new SizeA0ConcreteDecorator(new PriceConcreteComponent());
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
