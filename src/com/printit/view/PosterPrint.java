package com.printit.view;

import processing.core.PApplet;
import processing.core.PImage;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IScreen;

public class PosterPrint implements IScreen, ChainHandler {
	AppController appController;
	ChainHandler successor;
	PImage image;
	
	SizeA0PosterPrint sizeA0PosterPrint;
	SizeA1PosterPrint sizeA1PosterPrint;
	SizeA2PosterPrint sizeA2PosterPrint;
	SizeA3PosterPrint sizeA3PosterPrint;
	
	public PosterPrint(AppController appController){
		this.appController = appController;
		
		sizeA0PosterPrint = new SizeA0PosterPrint(appController);
		sizeA1PosterPrint = new SizeA1PosterPrint(appController);
		sizeA2PosterPrint = new SizeA2PosterPrint(appController);
		sizeA3PosterPrint = new SizeA3PosterPrint(appController);
		
		sizeA0PosterPrint.setSuccessor(sizeA1PosterPrint);
		sizeA1PosterPrint.setSuccessor(sizeA2PosterPrint);
		sizeA2PosterPrint.setSuccessor(sizeA3PosterPrint);	
		
	}

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(PApplet applet) {
		System.out.println(applet.mouseX + "     " + applet.mouseY);
		sizeA0PosterPrint.handleRequest(applet.mouseX, applet.mouseY);
		
	}

	@Override
	public void draw(PApplet applet) {
		PImage img=applet.loadImage("/poster print.png");
		applet.image(img, 0,0);
		
	}
	
	
	
	@Override
	public void handleRequest(int x, int y) {
		if(successor==null)System.out.println("Successor null in Poster");
		System.out.println("handle req in poster print" + successor.toString());
		// TODO Auto-generated method stub
		if (x >= 42 && y >= 382						//Corporate Event
				&& x <= 163 && y <= 516) {
			System.out.println("********PosterPrint************");
			

			appController.setCurrentScreen(((HomeScreen)appController.getHomeScreen()).getPosterPrint());
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
		System.out.println("set succesor in poster print");
		this.successor = next;
		
	}

}
