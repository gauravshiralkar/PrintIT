package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.IPassCode;

public class OnePinState implements IPassCode {

	KeyPad keypad;
	PApplet applet;
	public OnePinState(KeyPad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
	}
	@Override
	public void pressedNumber(String input) {
		// TODO Auto-generated method stub
		keypad.updatePassword(input);
		System.out.println("In one pin state pass is:: "+KeyPad.getPassword());
		applet.image(applet.loadImage("/password_icon.png"), 135,170);
		keypad.setState(keypad.getTwoPinState());
		
		
	}

	@Override
	public void backspace() {
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());		
		applet.image(applet.loadImage("/password_icon - white.png"), 60,170);
		
	}
	public String getState() {


			return "OnePinState";
	}

	

}
