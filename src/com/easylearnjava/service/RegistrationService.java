package com.easylearnjava.service;

import com.easylearnjava.dao.RegistrationDao;

public class RegistrationService {

public boolean checkUserData(String uName, String uPassword){
		
		RegistrationDao ds = new RegistrationDao();
		String passwordFromDB = ds.getPassword(uName);

		if(passwordFromDB == null){
			return true;
			
		}
		
		else 
			return false;
		
	}
		
}
		
	
	

