package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.IPassword;
import com.printit.controller.IPasswordProxy;
import com.printit.controller.PasswordProxy;

public class ThreePinDigit implements IPassword{

	Keypad keypad;
	PApplet applet;
	IPasswordProxy pp;
	public ThreePinDigit(Keypad keypad,PApplet applet){
		this.keypad = keypad;
		this.applet = applet;
		pp = new PasswordProxy();
	}
	@Override
	public void inputNumber(String num) {
		// TODO Auto-generated method stub
		keypad.updatePassword(num);
	
		System.out.println("GOING TO FOUR PIN STATE "+Keypad.getPassword());
		if(!(pp.checkPassword(Keypad.getPassword()))){
			System.out.println("incorrect password");
			applet.image(applet.loadImage("/delete-password.png"), 207,168);
			applet.image(applet.loadImage("/delete-password.png"), 137,171);
			applet.image(applet.loadImage("/delete-password.png"), 58,172);
			
			applet.fill(255,0,0);			
			applet.text("The entered PIN is invalid. Please try again",40,40);
			Keypad.setPassword("");
			keypad.setState(keypad.getNoPinState());
			
			
		}
		
	}

	@Override
	public void deleteDigit() {
		// TODO Auto-generated method stub
		keypad.updatePassword("");
		keypad.setState(keypad.getTwoPinState());
		applet.image(applet.loadImage("/delete-password.png"), 207,168);
	}
	public String getState() {

		return "ThreePinState";
	}
	
}
