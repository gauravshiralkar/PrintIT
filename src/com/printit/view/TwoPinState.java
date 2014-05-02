package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.IPassword;

public class TwoPinState implements IPassword{

	Keypad keypad;
	PApplet applet;
	public TwoPinState(Keypad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
	}
	@Override
	public void enteredNumber(String num) {
		// TODO Auto-generated method stub
		keypad.updatePassword(num);
		keypad.setState(keypad.getThreePinState());
		System.out.println("GOING TO THREE PIN STATE "+Keypad.getPassword());
		applet.image(applet.loadImage("/password.png"), 207,168);

	}

	@Override
	public void deleteDigit() {
		// TODO Auto-generated method stub
		keypad.updatePassword("");
		keypad.setState(keypad.getOnePinState());
		applet.image(applet.loadImage("/delete-password.png"), 137,171);
	}

	public String getState() {

		return "TwoPinState";
	}
	
}
