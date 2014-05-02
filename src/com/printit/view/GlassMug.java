package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;

public class GlassMug implements ChainHandler{
	ChainHandler successor;
	AppController appController;
	public GlassMug(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of Glass Mug");
		if (x >= 72 && y  >= 379						
				&& x <= 145 && y <= 470) {
			System.out.println("**********GlassPrint************");
			appController.setCurrentScreen(appController.getUploadScreen());
		}
		else{
			if (successor != null){
				successor.handleRequest(x, y);
			}
			else{
				System.out.println("Not my req");
			}
		}
		
	}

	@Override
	public void setSuccessor(ChainHandler next) {
		// TODO Auto-generated method stub
		this.successor = next;
	}

}
