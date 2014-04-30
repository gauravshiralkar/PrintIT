package com.printit.view;

import processing.core.PApplet;
import processing.core.PImage;




//import com.event.controller.AppController;
//import com.event.controller.IScreen;
import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IScreen;


public class HomeScreen implements IScreen, ChainHandler {
	
	PImage upc,img,Sports, Corporate, Music, Charity;
	AppController appController;
	MugPrint mugPrint;
	PhotoPrint photoPrint;
	PosterPrint posterPrint;
	CollagePrint collagePrint;
	ChainHandler successor = null;
	//Menu menu;
	
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

		/*
		upc = applet.loadImage("music_logo.png");
		applet.image(upc, 22,135);
		
		Sports = applet.loadImage("sports.png");
		applet.image(Sports, 22, 248);
		
		
		Corporate = applet.loadImage("corporate.png");
		applet.image(Corporate, 22,311);
		
		Music = applet.loadImage("music.png");
		applet.image(Music, 22,374);
		
		Charity = applet.loadImage("charity.png");
		applet.image(Charity, 22,437);
		
		applet.image(applet.loadImage("/home_icon.jpg"), 40,545);
		applet.image(applet.loadImage("/event_icon.png"), 120,545);
    	applet.image(applet.loadImage("/payment_icon.jpg"), 200,545);
    	applet.image(applet.loadImage("/search_icon.jpg"), 280,545);
    	
    	*/
	}

	@Override
	public void mousePressed(PApplet applet) {
		// TODO Auto-generated method stub
		/* if (applet.mouseX > 120 && applet.mouseX < 200					//Events
				&& applet.mouseY > 545 && applet.mouseY < 590) {
			appController.setCurrentScreen(appController.getMyCardOptions());
		} else if (applet.mouseX > 200 && applet.mouseX < 280					//Payment
				&& applet.mouseY > 545 && applet.mouseY < 590) {
			appController.setCurrentScreen(appController.getMyCardsPay());
		}else if (applet.mouseX > 280 && applet.mouseX < 360					//Search	
				&& applet.mouseY > 545 && applet.mouseY < 590) {
			appController.setCurrentScreen(appController.getMyCardsPay());
		}else if (applet.mouseX > 22 && applet.mouseX < 350						//Sports Event
				&& applet.mouseY > 248 && applet.mouseY < 311) {
			appController.setCurrentScreen(appController.getSportsScreen());
		}else if (applet.mouseX > 22 && applet.mouseX < 350						//Corporate Event
				&& applet.mouseY > 311 && applet.mouseY < 374) {
			appController.setCurrentScreen(appController.getCorporateScreen());
		}else if (applet.mouseX > 22 && applet.mouseX < 350						//Music Event
				&& applet.mouseY > 374 && applet.mouseY < 437) {
			appController.setCurrentScreen(appController.getMusicScreen());
		}else if (applet.mouseX > 22 && applet.mouseX < 350						//Charity Event
				&& applet.mouseY > 437 && applet.mouseY < 500) {
			appController.setCurrentScreen(appController.getCharityScreen());
		}else if (applet.mouseX > 40 && applet.mouseX < 320 && applet.mouseY > 545	//Home
				&& applet.mouseY < 590) {
			menu = new Menu(appController);
			menu.mousePressed(applet);
		}
		*/
		
		handleRequest(applet.mouseX, applet.mouseY);
		
	
	
	}

	@Override
	public void draw(PApplet applet) {
		// TODO Auto-generated method stub
		applet.size(364,688);
		img=applet.loadImage("/HomeScreen.png");
		applet.image(img, 0,0);

		//upc = applet.loadImage("event_logo.png");
		//applet.image(upc, 22,135);
		/*
		Sports = applet.loadImage("sports.png");
		applet.image(Sports, 22, 248);
		
		
		Corporate = applet.loadImage("corporate.png");
		applet.image(Corporate, 22,311);
		
		Music = applet.loadImage("music.png");
		applet.image(Music, 22,374);
		
		Charity = applet.loadImage("charity.png");
		applet.image(Charity, 22,437);
		
		applet.image(applet.loadImage("/home_icon.jpg"), 40,545);
		applet.image(applet.loadImage("/event_icon.png"), 120,545);
    	applet.image(applet.loadImage("/payment_icon.jpg"), 200,545);
    	applet.image(applet.loadImage("/search_icon.jpg"), 280,545);
    	
    	*/
		
		//applet.text("Final amount : $", 22, 100);
		//applet.textSize(28);
    	//applet.text("Final Amount: $", 40, 300);

	}

	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		mugPrint.handleRequest(x, y);
		
		System.out.println("mouse: " + x + "  " + y);
		
		
	}
 
	@Override
	public void setSuccessor(ChainHandler next) {
		// TODO Auto-generated method stub
	
		
	}

}
