package com.cts.employee.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {

	@Before("execution(void set*(*))")
	public void f1(JoinPoint jp) {
		System.out.println("-- Property about to Change in  " + jp.getSignature());
	}

	@After("execution(void set*(*))")
	public void f2(JoinPoint jp) {
		System.out.println("-- Property Chnged in  " + jp.getSignature());
	}

}
