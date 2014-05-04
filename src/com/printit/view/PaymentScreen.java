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
		//appController.setCurrentScreen(((HomeScreen)appController.getHomeScreen()).getPhotoPrint());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		PImage img1=applet.loadImage("/phone.png");
		applet.image(img1, 0,0);
		
		img = applet.loadImage("payment.png");
		applet.image(img,22,115);
	}
	
}

