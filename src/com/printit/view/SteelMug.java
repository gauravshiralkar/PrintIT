package com.printit.view;

import com.printit.controller.AppController;
import com.printit.controller.ChainHandler;
import com.printit.controller.IPriceComponent;
import com.printit.controller.PriceConcreteComponent;

public class SteelMug implements ChainHandler{
	ChainHandler successor;
	AppController appController;
	public SteelMug(AppController appController)
	{
		this.appController=appController;
	}
	@Override
	public void handleRequest(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Handle of Steel Mug");
		if (x >= 209 && y  >= 373						
				&& x <= 286 && y <= 484) {
			System.out.println("**********SteelPrint************");
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
		IPriceComponent ipc = new SteelMugConcreteDecorator(new PriceConcreteComponent());
		appController.setPrice(ipc.getPrice());
	}

}
