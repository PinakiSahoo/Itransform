package com.assign.jdbc.bank;

import java.sql.SQLException;
import java.time.LocalDateTime;

import com.assign.jdbc.bank.model.Transaction;

public class BankTransactionDataB {
public static void main(String[] args) throws SQLException {
	BankAccountTransaction fund=new BankAccountTransaction();
	FromAccountDao fAccount=new FromAccountDao();
	ToAccountDao tAccount=new ToAccountDao();
	Transaction transact=new Transaction();
	
	
	if(fund.transactionBetweenTwoAccounts(fAccount.findAccountById(1001),tAccount.findAccountById(1234),new Transaction(123, LocalDateTime.now(), 5000) )) {
		System.out.println("amount transaction is successfull");}
	else
		System.out.println("transaction failed");
}
}
