package com.printit.view;

import processing.core.PApplet;

import com.printit.controller.AppController;
import com.printit.controller.IPasswordProxy;
import com.printit.controller.IScreen;
import com.printit.controller.PasswordProxy;



public class PinScreen implements IScreen{
	AppController appController;
	Keypad keypad;
	IPasswordProxy pp;
	public PinScreen(AppController appController){
		this.appController = appController;
	}

	@Override
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		pp = new PasswordProxy(appController);
		keypad = new Keypad(applet);
		keypad.draw(applet);
	}
	@Override
	public void mousePressed(PApplet applet) {
		System.out.println("MouseX, MouseY"+ applet.mouseX+"  "+ applet.mouseY);
		// TODO Auto-generated method stub
		if (applet.mouseX > 22 && applet.mouseX < 128 && applet.mouseY > 410
				&& applet.mouseY < 480) {

			keypad.inputNumber("1");
			setCurrentScreen();


		}

		else if (applet.mouseX > 128 && applet.mouseX < 234 && applet.mouseY > 410
				&& applet.mouseY < 480) {
			keypad.inputNumber("2");
			setCurrentScreen();
		}

		else if (applet.mouseX > 234 && applet.mouseX < 337 && applet.mouseY > 410
				&& applet.mouseY < 480) {
			keypad.inputNumber("3");
			setCurrentScreen();

		}
		
		else if (applet.mouseX > 22 && applet.mouseX < 128
				&& applet.mouseY > 480 && applet.mouseY < 550) {
			keypad.inputNumber("4");
			setCurrentScreen();
		}
		
		else if (applet.mouseX > 128 && applet.mouseX < 234
				&& applet.mouseY > 480 && applet.mouseY < 550) {
			keypad.inputNumber("5");
			setCurrentScreen();
		}
		
		else if (applet.mouseX > 234 && applet.mouseX < 337
				&& applet.mouseY > 480 && applet.mouseY < 550) {
			keypad.inputNumber("6");
			setCurrentScreen();
		}

		else if (applet.mouseX > 22 && applet.mouseX < 128
				&& applet.mouseY > 550 && applet.mouseY < 620) {
			keypad.inputNumber("7");
			setCurrentScreen();

		}

		else if (applet.mouseX > 128 && applet.mouseX < 234
				&& applet.mouseY > 550 && applet.mouseY < 620) {
			keypad.inputNumber("8");
			setCurrentScreen();
		}

		else if (applet.mouseX > 234 && applet.mouseX < 337
				&& applet.mouseY > 550 && applet.mouseY < 620) {
			keypad.inputNumber("9");
			setCurrentScreen();
		}

		else if (applet.mouseX > 128 && applet.mouseX < 234
					&& applet.mouseY > 546 && applet.mouseY < 670) {
			keypad.inputNumber("0");
			setCurrentScreen();
		}									

		else if (applet.mouseX > 235 && applet.mouseX < 344
				&& applet.mouseY > 546 && applet.mouseY < 670) {
			keypad.deleteDigit();
			setCurrentScreen();
		} 
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		
	}
	
	public void setCurrentScreen(){
		System.out.println("PASSWORD IS"+Keypad.getPassword());
		if (Keypad.getPassword().length() < 4) {			
			appController.setCurrentScreen(appController.getPinScreen());
		}
		
		else 
		{
			pp.authenticate(Keypad.getPassword());
			System.out.println("correct password");
			
			//appController.setCurrentScreen(appController.getHomeScreen());
		}

	}

}
