package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IPriceComponent;
import com.printit.controller.IScreen;
import com.printit.controller.PriceConcreteComponent;

public class GlassMug implements IScreen, ChainHandler{
	ChainHandler successor;
	AppController appController;
	public GlassMug(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of Glass Mug");
		if (x >= 72 && y  >= 379						
				&& x <= 145 && y <= 470) {
			
			System.out.println("**********GlassPrint************");
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
		IPriceComponent ipc = new GlassMugConcreteDecorator(new PriceConcreteComponent());
		//System.out.println("Amout " + ipc.getPrice());
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
