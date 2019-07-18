package com.cts.product.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {

	void transferFunds(long fromAccount, long toAccount, double amount);

}