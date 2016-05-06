package com.iana.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GreetingDAOImpl implements GreetingDAO{

	 //Single DataSource configuration
	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	 
	//Single DataSource configuration
	 @Autowired
	 private DataSource dataSource;

	@Override
	public String getConnectedDatabaseProductName() throws Exception {
		return dataSource.getConnection().getMetaData().getDatabaseProductName();
	}
	 
	 
	 
	 
	 
	
	
}
