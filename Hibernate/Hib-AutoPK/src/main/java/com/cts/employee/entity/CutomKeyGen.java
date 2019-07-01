package com.cts.employee.entity;

import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CutomKeyGen implements IdentifierGenerator {

	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		String key = "ABC100";

		//LocalDateTime ldt = LocalDateTime.now();
		long l = System.currentTimeMillis();

		// ldt

		key = key + l;

		return key;
	}

}
