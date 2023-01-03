package com.example.demo.annotations;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.DTO.CardDetails;
import com.example.demo.DTO.Payment;

public class MyCardNameValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return Payment.class.equals(clazz);
	}

	@Override
	public void validate(Object paymentObj, Errors errors) {

		CardDetails cardDetails = ((Payment) paymentObj).getCardNumber();

		if (((cardDetails.getFirstFourDigits().length() + cardDetails.getFirstFourDigits().length()
				+ cardDetails.getFirstFourDigits().length()) < 9) || cardDetails.getFirstFourDigits().contains("000")) {

			errors.rejectValue("cardNumber", "102", "Card details message is not correct.");

		}

	}

}
