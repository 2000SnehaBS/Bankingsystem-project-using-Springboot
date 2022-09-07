package com.sixdee.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
		String msg = "";
		Optional<BankSystem> findById = repo.findById(customerId);
		if(findById.isPresent()) {
			repo.delete(findById.get());
			msg = "account deleted";
		}
		else {
			msg = "account not found";
		}
		return msg;
		
		
	}
	@PutMapping("/depositmoney")
	public String depositMoney(@RequestParam(value ="customerId" )int customerId  , @RequestParam(value="depositAmount") int depositAmount ) {
		System.out.println("customerId is "+customerId +"depositAmount"+depositAmount);
		Optional<BankSystem> customer = repo.findById(customerId);
		
		int updatedbalance=0;
		int balance= 0;
		String msg = "";
		if(customer.isPresent()) {
			BankSystem bankSystem = customer.get();
			balance = bankSystem.getBalance();
			if(depositAmount < 200) {
				msg = "deposit amount should be grater than 200";
			}
			else {
			
			updatedbalance = bankSystem.getBalance()+depositAmount;
			bankSystem.setBalance(updatedbalance);
			repo.save(bankSystem);
			msg = "amount deposited successfully updated account balance is : "+updatedbalance;
			}
			}
		      return msg;
		
		
	}
	@PutMapping("/withdrawmoney")
	public String withdrawMoney(@RequestParam(value ="customerId" )int customerId  , @RequestParam(value="withdrawAmount") int withdrawAmount ) {
		System.out.println("customerId is "+customerId +"withdrawAmount"+withdrawAmount);
		Optional<BankSystem> customer = repo.findById(customerId);
		
		int updatedbalance=0;
		int balance= 0;
		String msg = "";
		if(customer.isPresent()) {
			BankSystem bankSystem = customer.get();
			balance = bankSystem.getBalance();
			if(withdrawAmount > balance) {
				msg = "insufficuent balance";
			}
			else {
			
			updatedbalance = bankSystem.getBalance()-withdrawAmount;
			bankSystem.setBalance(updatedbalance);
			repo.save(bankSystem);
			msg = "amount withdraw successfully updated account balance is : "+updatedbalance;
			}
			}
		      return msg;
		
		
	}
	
	
}