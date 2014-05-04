package com.printit.view;

import processing.core.PApplet;
import processing.core.PImage;

import com.printit.controller.AppController;
import com.printit.controller.IScreen;

public class UploadScreen implements IScreen{
	AppController appController;
	PImage img;
	public UploadScreen(AppController appController){
		this.appController = appController;
	}


	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mousePressed(PApplet applet) {
		// TODO Auto-generated method stub
		int x,y;
		x=applet.mouseX;
		y=applet.mouseY;
		
		if (x >= 140 && y  >= 520						//Corporate Event
				&& x <= 210 && y <= 561) {
			System.out.println("**********UploadScreen************");
			appController.setCurrentScreen(appController.getOrderSummary());
		}
		
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		
		applet.size(364,688);
		img=applet.loadImage("uploadscreen.png");
		applet.image(img,0,0);
		applet.textSize(28);
    	//applet.text("Final Price: $"+(float)appController.getPrice(), 40, 300);
		
	}

}
