package com.printit.controller;

public class PasswordProxy implements IPasswordProxy{
	private AppController appController;
	PasswordSubject ps = new PasswordSubject();
	String cachedPassword = null;
	boolean cacheExpired = false;
	public PasswordProxy(AppController appController){
		this.appController = appController;
	}
	public void authenticate(String password)
	{
		if(cachedPassword == null)
		{
			System.out.println("Reading from subject");
			cachedPassword = ps.getPassword();
			cacheExpired = false;
		}
		else{
			System.out.println("Password is cached");
		}
			
		if(password.equalsIgnoreCase(cachedPassword))
		{
				
			System.out.println("PASSWORD CORRECT");
			appController.setCurrentScreen(appController.getHomeScreen());
		}
		else
			System.out.println("WRONG PASSWORD");
				
		
		}
		/*if(password.equalsIgnoreCase("4567"))
		{
			appController.setCurrentScreen(appController.getHomeScreen());
			return true;
		}
		return false;*/
	}


