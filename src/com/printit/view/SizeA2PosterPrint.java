package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;

public class SizeA2PosterPrint implements ChainHandler{


	ChainHandler successor;
	AppController appController;
	public SizeA2PosterPrint(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of SizeA2PosterPrint");
		if (x >= 44 && y  >= 409						//Corporate Event
				&& x <= 130 && y <= 538) {
			System.out.println("**********Size A2************");
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
