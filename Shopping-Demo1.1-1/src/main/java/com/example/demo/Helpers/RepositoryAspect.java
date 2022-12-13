package com.example.demo.Helpers;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RepositoryAspect {

	@Before("execution(* saveCustomerDataInRepo(..))")
	public void startDatabaseOperation() {

		System.out.println("DataBase Insertion Started....");

	}

	@After("execution(* saveCustomerDataInRepo(..))")
	public void endDataBaseOperation() {
		System.out.println("DataBase Insertion Ended....");

	}

}
