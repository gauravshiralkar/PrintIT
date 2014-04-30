package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.IPassCode;


public class NoPinState implements IPassCode{

	KeyPad keypad;
	PApplet applet;
	
	public NoPinState(KeyPad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
	}
	@Override
	public void pressedNumber(String input) {
		// TODO Auto-generated method stub
		applet.fill(0,0,0);			
		applet.text("Incorrect Pin, Please enter a valid Pin",40,40);	
		keypad.updatePassword(input);
		System.out.println("In No pin state pass is:: "+KeyPad.getPassword());		
		applet.image(applet.loadImage("/password_icon.png"), 60,170);
		keypad.setState(keypad.getOnePinState());
		
	}

	@Override
	public void backspace() {
		// TODO Auto-generated method stub
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());
	}

	public String getState() {

		return "NoPinState";
	}

}
