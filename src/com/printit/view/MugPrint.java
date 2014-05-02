package com.printit.view;
import processing.core.*;
import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IScreen;

import processing.core.PApplet;
import processing.core.PImage;

public class MugPrint implements IScreen, ChainHandler {
	AppController appController;
	ChainHandler successor;
	PImage img1;
	PImage img2;
	PImage img3;
	PImage img4;
	
	CeramicMug ceramicMug;
	PlasticMug plasticMug;
	GlassMug glassMug;
	SteelMug steelMug;
	
	
	public MugPrint(AppController appController){
		this.appController = appController;

		ceramicMug = new CeramicMug(appController);
		plasticMug = new PlasticMug(appController);
		glassMug = new GlassMug(appController);
		steelMug = new SteelMug(appController);
		
		ceramicMug.setSuccessor(plasticMug);
		plasticMug.setSuccessor(glassMug);
		glassMug.setSuccessor(steelMug);
		
	}

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(PApplet applet) {
		
		// TODO Auto-generated method stub
		
		System.out.println(applet.mouseX + "     " + applet.mouseY);
		ceramicMug.handleRequest(applet.mouseX, applet.mouseY);
		
	}

	@Override
	public void draw(PApplet applet) {
		PImage img=applet.loadImage("/phone.png");
		applet.image(img, 0,0);
		img1 = applet.loadImage("ceramicmug.jpg");
		img2= applet.loadImage("plasticmug.jpg");
		img3= applet.loadImage("glassmug.jpg");
		img4= applet.loadImage("steelmug.jpg");
		
		// TODO Auto-generated method stub
		
		applet.image(img1, 72, 248);
		
		
		
		applet.image(img2, 202,248);
		
		
		applet.image(img3, 72,374);
		
		
		applet.image(img4, 202,374);
		
	}
	@Override
	public void handleRequest(int x, int y) {
		if(successor==null)System.out.println("Successor null in mug");
		System.out.println("handle req in mug print"  + successor.toString());
		// TODO Auto-generated method stub
		if (x >= 45 && y  >= 210						
				&& x <= 150 && y <= 315) {
			System.out.println("**********MugPrint************");
			appController.setCurrentScreen(((HomeScreen)appController.getHomeScreen()).getMugPrint());
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
		System.out.println("set succesor in mug print");
		this.successor = next;
		
	}
	
}
