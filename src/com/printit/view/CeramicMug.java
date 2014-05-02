package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;

public class CeramicMug implements ChainHandler{
	ChainHandler successor;
	AppController appController;
	public CeramicMug(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of Cereamic Mug");
		if (x >= 79 && y  >= 253						
				&& x <= 139 && y <= 314) {
			System.out.println("**********CeramicPrint************");
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
