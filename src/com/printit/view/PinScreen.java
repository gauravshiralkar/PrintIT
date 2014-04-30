package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.AppController;
import com.printit.controller.IScreen;



public class PinScreen implements IScreen{
	AppController appController;
	KeyPad keypad;
	public PinScreen(AppController appController){
		this.appController = appController;
	}

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		keypad = new KeyPad(applet);
		keypad.draw(applet);
	}
	@Override
	public void mousePressed(PApplet applet) {
		System.out.println("MouseX, MouseY"+ applet.mouseX+"  "+ applet.mouseY);
		// TODO Auto-generated method stub
		if (applet.mouseX > 22 && applet.mouseX < 128 && applet.mouseY > 410
				&& applet.mouseY < 480) {

			keypad.pressedNumber("1");
			setCurrentScreen();


		}

		else if (applet.mouseX > 128 && applet.mouseX < 234 && applet.mouseY > 410
				&& applet.mouseY < 480) {
			keypad.pressedNumber("2");
			setCurrentScreen();
		}

		else if (applet.mouseX > 234 && applet.mouseX < 337 && applet.mouseY > 410
				&& applet.mouseY < 480) {
			keypad.pressedNumber("3");
			setCurrentScreen();

		}
		
		else if (applet.mouseX > 22 && applet.mouseX < 128
				&& applet.mouseY > 480 && applet.mouseY < 550) {
			keypad.pressedNumber("4");
			setCurrentScreen();
		}
		
		else if (applet.mouseX > 128 && applet.mouseX < 234
				&& applet.mouseY > 480 && applet.mouseY < 550) {
			keypad.pressedNumber("5");
			setCurrentScreen();
		}
		
		else if (applet.mouseX > 234 && applet.mouseX < 337
				&& applet.mouseY > 480 && applet.mouseY < 550) {
			keypad.pressedNumber("6");
			setCurrentScreen();
		}

		else if (applet.mouseX > 22 && applet.mouseX < 128
				&& applet.mouseY > 550 && applet.mouseY < 620) {
			keypad.pressedNumber("7");
			setCurrentScreen();

		}

		else if (applet.mouseX > 128 && applet.mouseX < 234
				&& applet.mouseY > 550 && applet.mouseY < 620) {
			keypad.pressedNumber("8");
			setCurrentScreen();
		}

		else if (applet.mouseX > 234 && applet.mouseX < 337
				&& applet.mouseY > 550 && applet.mouseY < 620) {
			keypad.pressedNumber("9");
			setCurrentScreen();
		}

		else if (applet.mouseX > 128 && applet.mouseX < 234
					&& applet.mouseY > 546 && applet.mouseY < 670) {
			keypad.pressedNumber("0");
			setCurrentScreen();
		}									

		else if (applet.mouseX > 235 && applet.mouseX < 344
				&& applet.mouseY > 546 && applet.mouseY < 670) {
			keypad.backspace();
			setCurrentScreen();
		} 
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		
	}
	
	public void setCurrentScreen(){
		System.out.println("Current :: "+KeyPad.getPassword());
		if (KeyPad.getPassword().length() < 4) {			
			appController.setCurrentScreen(appController.getPinScreen());
		}
		else if((KeyPad.getPassword()).equals("4567")){
			System.out.println("Else");
			appController.setCurrentScreen(appController.getHomeScreen());
		}
	}

}
