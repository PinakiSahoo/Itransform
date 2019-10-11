package com.assign.jdbc.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.assign.jdbc.bank.model.BankAccount;
import com.assign.jdbc.bank.model.Transaction;
import com.assign.jdbc.bank.util.DBUtil;

public class BankAccountTransaction {
	public boolean transactionBetweenTwoAccounts(BankAccount fromAccount, BankAccount toAccount,
			Transaction transaction) throws SQLException {
		Connection connection = DBUtil.getConnection();

		try {
			connection.setAutoCommit(false);

			try (Statement statement = connection.createStatement()) {

				statement.addBatch("update fromaccount set account_balance="+ fromAccount.withdraw(transaction.getTransactionAmount()) + "where account_id="+ fromAccount.getAccountId());
				statement.addBatch("update toaccount set account_balance=" + toAccount.deposit(transaction.getTransactionAmount())+ "where account_id=" + toAccount.getAccountId());

				int[] affectedrecords = statement.executeBatch();
				//System.out.println(affectedrecords.length);
				System.out.println(transaction.toString());
				connection.commit();
				
				return true;
			}
		} catch (Exception e) {
			connection.rollback();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
		return false;

	}
}
