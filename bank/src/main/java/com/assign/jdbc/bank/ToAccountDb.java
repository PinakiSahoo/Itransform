package com.assign.jdbc.bank;

import java.sql.SQLException;

import com.assign.jdbc.bank.exception.LowBalanceException;
import com.assign.jdbc.bank.model.BankAccount;

public class ToAccountDb {
	public static void main(String[] args) throws LowBalanceException, SQLException {
		ToAccountDao account=new ToAccountDao();
		if(account.addAccount(new BankAccount(1234, "Doremon", "Savings", 90000))) {
		System.out.println("Account is added");
	}
	else
		System.out.println("Failed to add account");
		//to display the element by id
		//BankAccount student = account.findAccountById(1001);
	//if(student != null)
//		System.out.println(student);
//		else
	//System.out.println("-- Employee Record not found --");	
//	BankAccount accountNew=new BankAccount();
//
//
//
//		
//
//	if(account.updateBankAccount(1001,student.withdraw(1000)))
//		System.out.println("Balance updated");
//		else
//			System.out.println("failed to update balance");
	}

}
