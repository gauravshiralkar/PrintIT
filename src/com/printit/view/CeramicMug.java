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
		if (x >= 44 && y  >= 214						//Corporate Event
				&& x <= 156 && y <= 317) {
			System.out.println("**********CeramicPrint************");
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
