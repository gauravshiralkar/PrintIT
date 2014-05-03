package com.printit.view;

import processing.core.PApplet;
import processing.core.PImage;




//import com.event.controller.AppController;
//import com.event.controller.IScreen;
import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IScreen;


public class HomeScreen implements IScreen{
	
	PImage upc,img,Sports, Corporate, Music, Charity;
	AppController appController;
	MugPrint mugPrint;
	PhotoPrint photoPrint;
	PosterPrint posterPrint;
	CollagePrint collagePrint;
	ChainHandler successor = null;
	
	
	public HomeScreen(AppController appController){
		this.appController = appController;
		mugPrint = new MugPrint(appController);
		photoPrint=new PhotoPrint(appController);
		posterPrint=new PosterPrint(appController);
		collagePrint=new CollagePrint(appController);
		
		mugPrint.setSuccessor(photoPrint);
		
		photoPrint.setSuccessor(posterPrint);
		
		posterPrint.setSuccessor(collagePrint);
		
	}

	public AppController getAppController() {
		return appController;
	}

	public void setAppController(AppController appController) {
		this.appController = appController;
	}

	public MugPrint getMugPrint() {
		return mugPrint;
	}

	public void setMugPrint(MugPrint mugPrint) {
		this.mugPrint = mugPrint;
	}

	public PhotoPrint getPhotoPrint() {
		return photoPrint;
	}

	public void setPhotoPrint(PhotoPrint photoPrint) {
		this.photoPrint = photoPrint;
	}

	public PosterPrint getPosterPrint() {
		return posterPrint;
	}

	public void setPosterPrint(PosterPrint posterPrint) {
		this.posterPrint = posterPrint;
	}

	public CollagePrint getCollagePrint() {
		return collagePrint;
	}

	public void setCollagePrint(CollagePrint collagePrint) {
		this.collagePrint = collagePrint;
	}

	public ChainHandler getSuccessor() {
		return successor;
	}

	@Override 
	public void setup(PApplet applet) {
		// TODO Auto-generated method stub
		applet.size(364,688);
		System.out.println("HomeScreen Load");
		img=applet.loadImage("/phone.png");
		applet.image(img, 0,0);
	
	}

	@Override
	public void mousePressed(PApplet applet) {
		
		mugPrint.handleRequest(applet.mouseX, applet.mouseY);
	
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		applet.size(364,688);
		img=applet.loadImage("/HomeScreen.png");
		applet.image(img, 0,0);

		

	}

}


