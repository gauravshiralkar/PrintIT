package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.IPassword;


public class NoPinState implements IPassword{

	Keypad keypad;
	PApplet applet;
	
	public NoPinState(Keypad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
	}
	@Override
	public void enteredNumber(String num) {
		// TODO Auto-generated method stub
		applet.fill(0,0,0);			
			
		keypad.updatePassword(num);
		System.out.println("NO PIN STATE "+Keypad.getPassword());		
		applet.image(applet.loadImage("/password.png"), 58,172);
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
