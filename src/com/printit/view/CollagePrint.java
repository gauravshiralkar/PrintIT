package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IScreen;

public class CollagePrint implements IScreen, ChainHandler{
	
	AppController appController;
	ChainHandler successor;
	
	public CollagePrint(AppController appController){
		this.appController = appController;
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
	@Override
	public void handleRequest(int x, int y) {
		if(successor==null)System.out.println("Successor null in collage");
		//System.out.println("handle req in collage print"  + successor.toString());
		// TODO Auto-generated method stub
		if (x >= 193 && y >= 388						//Corporate Event
				&& x <= 315 && y <= 513) {
			System.out.println("********CollagePrint************");
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
		System.out.println("set succesor in collage print");
		this.successor = null;
		
	}

}
