package com.printit.view;


import processing.core.*;

public class PosterPrintScreen extends PApplet{

	PImage image;
	
	public void setup() {
		size(220,350);
		 background(450);
		image = loadImage("poster print.png");
		 
	}
	 
	public void draw(PApplet applet){
		
			applet.size(364,688);
			image=applet.loadImage("/HomeScreen.png");
			applet.image(image, 0,0);
		 
	}
	

}
