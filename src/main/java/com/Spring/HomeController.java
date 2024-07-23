package com.Spring;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Spring MVC Controller
public class HomeController 
{
	@Autowired
	ConnectionDB cn;
	
	
	@GetMapping("/")  // End Point
	public String indexPage(Model md)
	{
		Connection con = cn.connect();
		md.addAttribute("connect",con);
		
		return "index";
	}
}
