package com.printit.controller;
/*
import com.event.view.CharityScreen;
import com.event.view.CorporateScreen;
import com.event.view.HomeScreen;
import com.event.view.KeyPad;
import com.event.view.MapScreen;
import com.event.view.MixEventScreen;
import com.event.view.MusicScreen;
import com.event.view.PinScreen;
import com.event.view.ReceiptScreen;
import com.event.view.SportsScreen;
import com.event.controller.IScreen;
*/
import com.printit.view.HomeScreen;
import com.printit.view.PinScreen;
import com.printit.view.UploadScreen;

import processing.core.PApplet;

public class AppController extends PApplet{

	private static final long serialVersionUID = 1L;
	
	IScreen pinScreen;
	IScreen homeScreen;
	IScreen sportsScreen;
	IScreen musicScreen;
	//IScreen corporateScreen;
	//IScreen charityScreen;
	IScreen currentScreen;
	//IScreen receiptScreen;
	//IScreen mapScreen;
	//IScreen mixEventScreen;
	IScreen mugPrint;
	IScreen uploadScreen;
	double cost;
	
	
	
	public AppController(){
		pinScreen = new PinScreen(this);
		homeScreen = new HomeScreen(this);
		uploadScreen=new UploadScreen(this);
		//mugPrint = new MugPrint(this);
		//sportsScreen = new SportsScreen(this);
		//musicScreen = new MusicScreen(this);
		//corporateScreen = new CorporateScreen(this);
		//charityScreen = new CharityScreen(this);
		//receiptScreen = new ReceiptScreen(this);
		//mapScreen = new MapScreen(this);
		//mixEventScreen = new MixEventScreen(this);
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
	
	public IScreen getUploadScreen(){
		return uploadScreen;
	}
	
	public void serUploadScreen(IScreen uploadScreen){
		this.uploadScreen=uploadScreen;
	}
/*	
	public IScreen getCharityScreen() {

		return charityScreen;
	}

	public void setCharityScreen(IScreen charityScreen) {
		this.charityScreen = charityScreen;
	}
	public IScreen getCorporateScreen() {

		return corporateScreen;
	}

	public void setCorporateScreen(IScreen corporateScreen) {
		this.corporateScreen = corporateScreen;
	}
	
	public IScreen getHomeScreen() {

		return homeScreen;
	}

	public void setHomeScreen(IScreen homeScreen) {
		this.homeScreen = homeScreen;
	}
	
	public IScreen getMusicScreen() {

		return musicScreen;
	}

	public void setMusicScreen(IScreen musicScreen) {
		this.musicScreen = musicScreen;
	}
	

	public IScreen getSportsScreen() {

		return sportsScreen;
	}

	public void setSportsScreen(IScreen sportsScreen) {
		this.sportsScreen = sportsScreen;
	}


	public IScreen getReceiptScreen() {
		return receiptScreen;
	}


	public void setReceiptScreen(IScreen receiptScreen) {
		this.receiptScreen = receiptScreen;
	}


	public IScreen getMapScreen() {
		return mapScreen;
	}


	public void setMapScreen(IScreen mapScreen) {
		this.mapScreen = mapScreen;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public IScreen getMixEventScreen() {
		return mixEventScreen;
	}


	public void setMixEventScreen(IScreen mixEventScreen) {
		this.mixEventScreen = mixEventScreen;
	}
*/
	
	
	public IScreen getHomeScreen() {

		return homeScreen;
	}

	public void setHomeScreen(IScreen homeScreen) {
		this.homeScreen = homeScreen;
	}


	
}
