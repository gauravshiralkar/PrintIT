package com.printit.view;

import processing.core.PApplet;
import processing.core.PImage;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IScreen;

public class PhotoPrint implements IScreen, ChainHandler{
	
	AppController appController;
	ChainHandler successor=null;
	PImage img;
	
	public PhotoPrint(AppController appController){
		this.appController = appController;
	}

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
	}


	@Override
	public void mousePressed(PApplet applet) {
		System.out.println(applet.mouseX+"  "+ applet.mouseY);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		PImage img1=applet.loadImage("/phone.png");
		applet.image(img1, 0,0);
		
		img = applet.loadImage("my_photoprintscreen.png");
		applet.image(img,22,135);
	}
	@Override
	public void handleRequest(int x, int y) {
		if(successor==null)System.out.println("Successor null in PhotoPrint");
		System.out.println("handle req in photo print"+successor.toString());
		// TODO Auto-generated method stub
		if (x >= 188 && y >= 213 && x <= 307 && y <= 309) 
		{
			System.out.println("********PhotoPrint************");
			appController.setCurrentScreen(((HomeScreen)appController.getHomeScreen()).getPhotoPrint());
		}
		else
		{
			if (successor != null)
			{
				successor.handleRequest(x, y);
			}
			else
			{
				System.out.println("Not my req");
			}
		}
		
	}
	@Override
	public void setSuccessor(ChainHandler next) {
		// TODO Auto-generated method stub
		System.out.println("set succesor in photo print");
		this.successor = next;
		

	}
}

