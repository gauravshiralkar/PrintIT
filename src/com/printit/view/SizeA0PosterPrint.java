package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;

public class SizeA0PosterPrint implements ChainHandler{


	ChainHandler successor;
	AppController appController;
	public SizeA0PosterPrint(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of SizeA0PosterPrint");
		if (x >= 38 && y  >= 217						
				&& x <= 154 && y <= 390) {
			System.out.println("**********Size A0************");
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
