package com.printit.controller;

import processing.core.PApplet;

public interface IScreen {

	public void setup(PApplet applet);
	public void mousePressed(PApplet applet);
	public void draw(PApplet applet);
}
