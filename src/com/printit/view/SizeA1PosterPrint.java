package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;

public class SizeA1PosterPrint implements ChainHandler{


	ChainHandler successor;
	AppController appController;
	public SizeA1PosterPrint(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of SizeA1PosterPrint");
		if (x >= 199 && y  >= 219						//Corporate Event
				&& x <= 302 && y <= 334) {
			System.out.println("**********Size A1************");
			appController.setCurrentScreen(((HomeScreen)appController.getHomeScreen()).getMugPrint());
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
