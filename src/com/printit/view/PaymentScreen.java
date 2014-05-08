package com.printit.view;

import processing.core.PApplet;
import processing.core.PImage;

import com.printit.controller.AppController;
import com.printit.controller.IScreen;

public class PaymentScreen implements IScreen{
	
	AppController appController;
	PImage img;
	
	public PaymentScreen(AppController appController){
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
			System.out.println("**********PaymentScreen************");
			appController.setCurrentScreen(appController.getThankYouScreen());
		}
		
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		PImage img1=applet.loadImage("/phone.png");
		applet.image(img1, 0,0);
		applet.textSize(28);
		img = applet.loadImage("payment.png");
		applet.image(img,22,115);
    	applet.text("Final Amount: $"+(float)appController.getPrice(), 38, 252);
	}
	
}

