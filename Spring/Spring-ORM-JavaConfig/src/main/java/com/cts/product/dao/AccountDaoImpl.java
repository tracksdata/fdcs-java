package com.cts.product.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entities.Account;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void debit(long accountNumber, double amount) {

		Session ses = sf.getCurrentSession();
		Account acc = ses.get(Account.class, accountNumber);

		if (acc.getBalance() >= amount)
			acc.setBalance(acc.getBalance() - amount);
		else
			System.out.println("Insuffient Balance");

		ses.update(acc);

	}

	@Override
	public void credit(long accountNumber, double amount) {

		Session ses = sf.getCurrentSession();
		Account acc = ses.get(Account.class, accountNumber);

		if (!(amount <= 0))
			acc.setBalance(acc.getBalance() + amount);
		else
			System.out.println("Invalid Credit Amount");

		ses.update(acc);

	}

	@Override
	public void fundsTransfer(long toAccountNumber, double amount) {

		Session ses = sf.getCurrentSession();
		Account acc = ses.get(Account.class, toAccountNumber);
		acc.setBalance(acc.getBalance() + amount);
		ses.update(acc);
	}

}
