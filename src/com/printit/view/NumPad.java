package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.INumPad;

public class NumPad implements INumPad {

	PApplet applet;
	
	public NumPad(PApplet applet){
		this.applet = applet;
	}

	public void display() {
		// TODO Auto-generated method stub
		applet.image(applet.loadImage("/keypad.png"), 22,410);
		// TODO Auto-generated method stub

	}

}
