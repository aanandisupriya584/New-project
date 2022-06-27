package com.banking.SpringBankAccount.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.SpringBankAccount.entity.Account;
import com.banking.SpringBankAccount.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repository;
	
	public Account saveAccount(Account account) {
		
		return repository.save(account);	
	}
	
	public List<Account> saveAccounts(List<Account> accounts){
		
		return repository.saveAll(accounts);
	}
	
	public List<Account> getAccounts(){
		
		return repository.findAll();
	}
	
	public Account getAccountById(int id) {
		
		return repository.findById(id).orElse(null);
	}
	
	public Account getAccountByName(String name) {
		
		return repository.findByName(name);
	}
	
	public String deleteAccount(int id) {
		
		repository.deleteById(id);
		return "Account deleted"+ id;
	}
	
	public Account updateAccount(Account account) {
		
		Account existingAccount= repository.findById(account.getId()).orElse(null);
		existingAccount.setAccNo(account.getAccNo());
		existingAccount.setName(account.getName());
		existingAccount.setAddress(account.getAddress());
		existingAccount.setBank(account.getBank());
		return repository.save(existingAccount);
	}
	

}
