package com.printit.controller;

import com.printit.view.HomeScreen;
import com.printit.view.PinScreen;
import com.printit.view.UploadScreen;
import com.printit.view.OrderSummary;
import com.printit.view.PaymentScreen;
import com.printit.view.ThankYouScreen;

import processing.core.PApplet;

public class AppController extends PApplet{

	private static final long serialVersionUID = 1L;
	
	IScreen pinScreen;
	IScreen homeScreen;
	IScreen sportsScreen;
	IScreen musicScreen;
	
	IScreen currentScreen;
	IScreen mugPrint;
	IScreen uploadScreen;
	IScreen orderSummary;
	IScreen paymentScreen;
	IScreen thankyouScreen;
	double price;
	
	
	
	public AppController(){
		System.out.println("This = "+ this.toString());
		pinScreen = new PinScreen(this);
		homeScreen = new HomeScreen(this);
		currentScreen = pinScreen;
		uploadScreen=new UploadScreen(this);
		orderSummary=new OrderSummary(this);
		paymentScreen=new PaymentScreen(this);
		thankyouScreen=new ThankYouScreen(this);
		
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
	
	public IScreen getUploadScreen(){
		return uploadScreen;
	}
	
	public void setUploadScreen(IScreen uploadScreen){
		this.uploadScreen=uploadScreen;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	
	public IScreen getOrderSummary(){
		return orderSummary;
	}
	
	public IScreen getPaymentScreen(){
		return paymentScreen;
	}
	
	public IScreen getThankYouScreen(){
		return thankyouScreen;
	}
	
}
