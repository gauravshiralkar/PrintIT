package com.printit.controller;

import com.printit.view.HomeScreen;
import com.printit.view.PinScreen;

import processing.core.PApplet;

public class AppController extends PApplet{

	private static final long serialVersionUID = 1L;
	
	IScreen pinScreen;
	IScreen homeScreen;
	IScreen sportsScreen;
	IScreen musicScreen;
	
	IScreen currentScreen;
	IScreen mugPrint;
	double cost;
	
	
	
	public AppController(){
		pinScreen = new PinScreen(this);
		homeScreen = new HomeScreen(this);
		//mugPrint = new MugPrint(this);
		
		currentScreen = pinScreen;
		//currentScreen = homeScreen;
		
		setCurrentScreen(pinScreen);
	}
	
	
	
	public void setup() {

		currentScreen.setup(this);
	}


	@Override
	public void mousePressed() {

		currentScreen.mousePressed(this);
		currentScreen.draw(this);
	}

	public IScreen getCurrentScreen() {

		return currentScreen;
	}
	
	public void setCurrentScreen(IScreen currentScreen) {

		this.currentScreen = currentScreen;
	}
	
	public void draw(){
		
		currentScreen.draw(this);
	}

	public IScreen getPinScreen() {

		return pinScreen;
	}

	public void setPinScreen(IScreen pinScreen) {
		this.pinScreen = pinScreen;
	}
	
	
	public IScreen getHomeScreen() {

		return homeScreen;
	}

	public void setHomeScreen(IScreen homeScreen) {
		this.homeScreen = homeScreen;
	}


	
}
