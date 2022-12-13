package com.example.demo.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCustomEmailValidation implements ConstraintValidator<MyValidEmail, String> {

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {

		if (email.contains(".com")|| email.isBlank()) {

			return true;
		}

		return false;
	}

}
