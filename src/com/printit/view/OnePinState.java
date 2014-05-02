package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.IPassword;

public class OnePinState implements IPassword {

	Keypad keypad;
	PApplet applet;
	public OnePinState(Keypad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
	}
	@Override
	public void enteredNumber(String num) {
		// TODO Auto-generated method stub
		keypad.updatePassword(num);
		System.out.println("GOING to TWO PIN STATE "+Keypad.getPassword());
		applet.image(applet.loadImage("/password.png"), 137,171);
		keypad.setState(keypad.getTwoPinState());
		
		
	}

	@Override
	public void deleteDigit() {
		keypad.updatePassword("");
		keypad.setState(keypad.getNoPinState());		
		applet.image(applet.loadImage("/delete-password.png"), 58,172);
		
	}
	public String getState() {


			return "OnePinState";
	}

	

}
