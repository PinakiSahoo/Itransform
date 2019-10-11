package com.assign.jdbc.model;

public class BankAccount {
	private int accountId;
	private String password;
	private double balance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountId, String password, double balance) {
		super();
		this.accountId = accountId;
		this.password = password;
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", password=" + password + ", balance=" + balance + "]";
	}
	

}
