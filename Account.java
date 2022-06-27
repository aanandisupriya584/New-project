package com.banking.SpringBankAccount.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account_tbl")
public class Account {
	
	@Id
	@GeneratedValue
	private int id;
	private int accNo;
	private String name;
	private String address;
	private String bank;

	
	public Account() {
		super();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBank() {
		return bank;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public Account(int id, int accNo, String name, String address, String bank) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.name = name;
		this.address = address;
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", accNo=" + accNo + ", name=" + name + ", address=" + address + ", bank=" + bank
				+ "]";
	}
	
	


}
