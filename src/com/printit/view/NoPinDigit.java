package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.IPassword;


public class NoPinDigit implements IPassword{

	Keypad keypad;
	PApplet applet;
	
	public NoPinDigit(Keypad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
	}
	@Override
	public void inputNumber(String num) {
		// TODO Auto-generated method stub
		applet.fill(0,0,0);			
			
		keypad.updatePassword(num);
		applet.image(applet.loadImage("/password.png"), 57,173);
		keypad.setState(keypad.getOnePinState());
		
	}

	@Override
	public void deleteDigit() {
		// TODO Auto-generated method stub
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());
	}

	public String getState() {

		return "NoPinState";
	}

}
