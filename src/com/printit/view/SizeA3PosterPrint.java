package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;

public class SizeA3PosterPrint implements ChainHandler{


	ChainHandler successor;
	AppController appController;
	public SizeA3PosterPrint(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of SizeA3PosterPrint");
		if (x >= 201 && y  >= 417						//Corporate Event
				&& x <= 285 && y <= 475) {
			System.out.println("**********Sise A3************");
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
