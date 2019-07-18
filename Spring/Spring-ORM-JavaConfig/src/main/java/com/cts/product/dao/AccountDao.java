package com.cts.product.dao;

public interface AccountDao {

	void debit(long accountNumber, double amount);

	void credit(long accountNumber, double amount);

	void fundsTransfer(long toAccountNumber, double amount);

}