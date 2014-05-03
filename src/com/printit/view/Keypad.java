package com.printit.view;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

import com.printit.controller.INumPad;
import com.printit.controller.IPassword;
import com.printit.controller.IScreen;

public class Keypad{

	IPassword NoPinState;
	IPassword OnePinState;
	IPassword TwoPinState;
	IPassword ThreePinState;
	IPassword FourPinState;	
	IPassword state;
	static String password = ""; 
	PImage img;
	
	INumPad inumpad;
	
	public Keypad(PApplet applet){
		NoPinState = new NoPinState(this,applet);
		OnePinState = new OnePinState(this,applet);
		TwoPinState = new TwoPinState(this,applet);
		ThreePinState = new ThreePinState(this,applet);
		FourPinState = new FourPinState(this,applet);
		state = NoPinState;
		
		inumpad = new NumPad(applet);
		
		
	}	
	
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		applet.size(364,688);
		img=applet.loadImage("/phone.png");		
		applet.image(img, 0,0);

		applet.image(applet.loadImage("/panel.png"), 22,135);
		
		display();
		
		
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		Keypad.password = password;
	}	
	
	public String getState(){


		return state.getState();
	}

	public void setState(IPassword state){
		System.out.println("State is "+state);

		this.state=state;
	}

	public IPassword getNoPinState(){

		return NoPinState;
	}

	public IPassword getOnePinState(){

		return OnePinState;
	}

	public IPassword getTwoPinState(){

		return TwoPinState;
	}

	public IPassword getThreePinState(){

		return ThreePinState;
	}

	public IPassword getFourPinState(){

		return FourPinState;
	}


	public void enteredNumber(String input){

		state.enteredNumber(input);
		
	}

	public void deleteDigit(){

		state.deleteDigit();
		
	}

	public void updatePassword(String num){

		if(num == "" && password.length()>0)
			password=password.substring(0,password.length()-1);
		else 
			password += num;			
	}

	
	public void display() {
			
			inumpad.display();
		//}
		
	}

	

}
