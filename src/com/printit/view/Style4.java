package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IPriceComponent;
import com.printit.controller.PriceConcreteComponent;

public class Style4 implements ChainHandler{
	ChainHandler successor;
	AppController appController;
	public Style4(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of Style4");
		if (x >= 201 && y  >= 434						//Corporate Event
				&& x <= 314 && y <= 548) {
			System.out.println("**********Style4************");
			setPrice();
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
	
	public void setPrice()
	{
		IPriceComponent ipc = new CeramicMugConcreteDecorator(new PriceConcreteComponent());
		appController.setPrice(ipc.getPrice());
	}

}
