package com.example.demo.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptions {

	@ExceptionHandler(value = Exception.class)
	public String exception(Exception e, Model model) {

		model.addAttribute("exceptionMsg", e.getMessage());

		e.printStackTrace();

		return "exceptionPage";
	}

	@ExceptionHandler(value = NullPointerException.class)
	public String NullPointerException(Exception e, Model model) {

		model.addAttribute("exceptionMsg", e.getMessage());

		e.printStackTrace();

		return "exceptionPage";
	}

}
