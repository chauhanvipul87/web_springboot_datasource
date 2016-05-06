package com.iana.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iana.repository.GreetingDAO;

@Service
public class GreetingServiceImpl implements GreetingService{

	
	@Autowired
	private GreetingDAO greetingDAO;
	   
	@Override
	public String getConnectedDatabaseProductName() throws Exception {
		return greetingDAO.getConnectedDatabaseProductName();
	}

}
