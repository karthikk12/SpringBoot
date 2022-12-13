package com.example.demo.Helpers;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HibernateAspectHelper {

	@Before("execution(* getFactoryInstance(..))")
	public void SessionStartData() {

		System.out.println("Session Factory ended.......");

	}

	@After("execution(* getFactoryInstance(..))")
	public void SessionEndData() {

		System.out.println("Session Factory closed.......");

	}

}
