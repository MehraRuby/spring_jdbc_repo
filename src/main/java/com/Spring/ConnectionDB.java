package com.Spring;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;



@Configuration
@Repository
public class ConnectionDB 
{
    @Bean
    Connection connect()
    		{	
    		try {
    			Class.forName("com.mysql.cj.jdbc.Driver");		
    			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingcart","root","angad#18");
    			return con;	
    			}
    		catch(Exception e) {e.printStackTrace();}
    		return  null;
    		}		
	
}
