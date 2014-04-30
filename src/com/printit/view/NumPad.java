package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.INumPad;

public class NumPad implements INumPad {

	PApplet applet;
	
	public NumPad(PApplet applet){
		this.applet = applet;
	}

	public void NumDisplay() {
		// TODO Auto-generated method stub
		applet.image(applet.loadImage("/keypad.png"), 22,410);
		// TODO Auto-generated method stub

	}

	@Override
	public void addDisplay(INumPad c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDisplay(INumPad c) {
		// TODO Auto-generated method stub

	}

	@Override
	public INumPad getDisplayNum(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
