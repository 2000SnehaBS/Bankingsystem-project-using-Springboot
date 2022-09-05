package com.sixdee.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankSystemController
{
	@Autowired
	BankSystemRepo repo;
	@RequestMapping("/")
	public String home() 
	{
		return "home.jsp";
	}
	@RequestMapping("/addAccount")
	public String addAccount(BankSystem account) 
	{
		repo.save(account);
		return "home.jsp";
	}
	
	
}