package com.printit.view;

import processing.core.PApplet;
import processing.core.PImage;

import com.printit.controller.INumPad;
import com.printit.controller.IPassCode;

public class KeyPad implements INumPad{

	IPassCode NoPinState;
	IPassCode OnePinState;
	IPassCode TwoPinState;
	IPassCode ThreePinState;
	IPassCode FourPinState;	
	IPassCode state;
	static String password = ""; 
	PImage img;
	INumPad inumpad;
	
	public KeyPad(PApplet applet){
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
		//applet.image(applet.loadImage("/event_home33.jpg"), 50,210);	
		NumDisplay();
		
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		KeyPad.password = password;
	}	
	
	public String getState(){


		return state.getState();
	}

	public void setState(IPassCode state){
		System.out.println("Set state as:: "+state);

		this.state=state;
	}

	public IPassCode getNoPinState(){

		return NoPinState;
	}

	public IPassCode getOnePinState(){

		return OnePinState;
	}

	public IPassCode getTwoPinState(){

		return TwoPinState;
	}

	public IPassCode getThreePinState(){

		return ThreePinState;
	}

	public IPassCode getFourPinState(){

		return FourPinState;
	}


	public void pressedNumber(String input){

		state.pressedNumber(input);
		
	}

	public String backspace(){

		state.backspace();
		return "bk";
	}

	public void updatePassword(String num){

		if(num == "" && password.length()>0)
			password=password.substring(0,password.length()-1);
		else 
			password += num;			
	}

	@Override
	public void NumDisplay() {
		// TODO Auto-generated method stub
			inumpad.NumDisplay();
		
	}

	@Override
	public void addDisplay(INumPad c) {
		// TODO Auto-generated method stud
		
	}

	@Override
	public void removeDisplay(INumPad c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public INumPad getDisplayNum(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
