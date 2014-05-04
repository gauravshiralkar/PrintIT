package com.printit.view;

import processing.core.PApplet;
import processing.core.PImage;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IScreen;

public class OrderSummary implements IScreen{
	
	AppController appController;
	PImage img;
	
	public OrderSummary(AppController appController){
		this.appController = appController;
		
	}

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
	}


	@Override
	public void mousePressed(PApplet applet) {
		
		System.out.println(applet.mouseX+"  "+ applet.mouseY);
		int x,y;
		x=applet.mouseX;
		y=applet.mouseY;
		
		if (x >= 140 && y  >= 520						//Corporate Event
				&& x <= 210 && y <= 561) {
			System.out.println("**********UploadScreen************");
			appController.setCurrentScreen(appController.getPaymentScreen());
		}
		
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		PImage img1=applet.loadImage("/phone.png");
		applet.image(img1, 0,0);
		
		img = applet.loadImage("order_summary.png");
		applet.image(img,22,118);
	}
	
}

