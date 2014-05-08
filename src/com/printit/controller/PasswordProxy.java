package com.printit.controller;

public class PasswordProxy implements IPasswordProxy{
	PasswordSubject ps = new PasswordSubject();
	public Boolean checkPassword(String password)
	{
		if(password.equalsIgnoreCase(ps.getPassword()))
		{
			return true;
		}
		return false;
	}

}
