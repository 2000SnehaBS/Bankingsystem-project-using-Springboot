package com.sixdee.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankSystemController
{
	@Autowired
	BankSystemRepo repo;
	
	@PostMapping("/Account")
	@ResponseBody
	public BankSystem addAccount(@RequestBody BankSystem account) 
	{
		repo.save(account);
		return account;
	}
	
	@DeleteMapping("/Account/{customerId}")
	public String closeAccount(@PathVariable int customerId) {
		BankSystem acc = repo.getOne(customerId);
		repo.delete(acc);
		return "account deleted";
		
	}
	
	
}
