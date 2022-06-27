package com.banking.SpringBankAccount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.SpringBankAccount.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	Account findByName(String name);

}
