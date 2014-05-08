package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.IPassword;
import com.printit.controller.IPasswordProxy;
import com.printit.controller.PasswordProxy;

public class FourPinState implements IPassword{

	Keypad keypad;
	PApplet applet;
	//IPasswordProxy pp;
	public FourPinState(Keypad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
		//pp = new PasswordProxy();
	}
	@Override
	public void enteredNumber(String num) {
		// TODO Auto-generated method stub
		System.out.println("FOUR PIN STATE"+Keypad.getPassword());
		//if	(!(pp.checkPassword(Keypad.getPassword()))){
		if(!Keypad.getPassword().equalsIgnoreCase("4567")){
			applet.image(applet.loadImage("/delete-password.png"), 207,168);
			applet.image(applet.loadImage("delete-password.png"), 137,171);
			applet.image(applet.loadImage("/delete-password.png"), 58,172);
			applet.fill(255,0,0);			
			applet.text("The entered PIN is invalid. Please try again",40,40);
			Keypad.setPassword("");
			keypad.setState(keypad.getNoPinState());
			
			
		}
	}

	@Override
	public void deleteDigit() {
		
		keypad.updatePassword("");
		keypad.setState(keypad.getThreePinState());
		
	}

	@Override
	public String getState() {

		return "FourPinState";
	}
	

	

}
