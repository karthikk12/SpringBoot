package com.example.demo.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptions {

	@ExceptionHandler(value = Exception.class)
	public String exception(Exception e) {

		e.printStackTrace();
		return "exceptionPage";
	}

}
