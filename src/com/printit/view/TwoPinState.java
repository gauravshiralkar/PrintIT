package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.IPassCode;

public class TwoPinState implements IPassCode{

	KeyPad keypad;
	PApplet applet;
	public TwoPinState(KeyPad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
	}
	@Override
	public void pressedNumber(String input) {
		// TODO Auto-generated method stub
		keypad.updatePassword(input);
		keypad.setState(keypad.getThreePinState());
		System.out.println("In three pin state pass is:: "+KeyPad.getPassword());
		applet.image(applet.loadImage("/password_icon.png"), 205,170);

	}

	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		keypad.updatePassword("");
		keypad.setState(keypad.getOnePinState());
		applet.image(applet.loadImage("/password_icon - white.png"), 135,170);
	}

	public String getState() {

		return "TwoPinState";
	}
	
}
