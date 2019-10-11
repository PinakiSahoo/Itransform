package com.assign.jdbc.bank.model;

import com.assign.jdbc.bank.exception.LowBalanceException;

public class BankAccount {
	private double accountId;
	private String accountName;
	private String accountType;
	private double accountBalance;
	public BankAccount(double accountId, String accountName, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public BankAccount() {
		super();
	}
	public BankAccount(double accountBalance) {
		super();
		this.accountBalance=accountBalance;
	}
	public BankAccount(double id,double accountBalance) {
		super();
		this.accountId=id;
		this.accountBalance=accountBalance;
	}	
	public double getAccountId() {
		return accountId;
	}
	public void setAccountId(double accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double deposit(double amount) {
		accountBalance = accountBalance + amount;
		System.out.println("You have deposited the amount = "+amount+". Available balance is = "+accountBalance);
		return accountBalance;
	}

	public double withdraw(double amount) throws LowBalanceException  {
		if(accountBalance - amount >= 0) {
			accountBalance = accountBalance - amount;
			System.out.println("You have withdrawn the amount = "+amount+". Available balance is = "+accountBalance);
			return accountBalance;
		}
		else
			throw new LowBalanceException("You don't have sufficient fund...");
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountName=" + accountName + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	

}
