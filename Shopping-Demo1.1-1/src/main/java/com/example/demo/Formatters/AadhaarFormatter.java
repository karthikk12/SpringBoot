package com.example.demo.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.demo.DTO.Aadhaar;

public class AadhaarFormatter implements Formatter<Aadhaar> {

	@Override
	public String print(Aadhaar object, Locale locale) {
		return null;
	}

	@Override
	public Aadhaar parse(String input, Locale locale) throws ParseException {

		Aadhaar aadhaar = new Aadhaar();

		if (input.length() > 12 || input.length() < 0) {

			aadhaar.setFirstFourLetters("1212");
			aadhaar.setSecondFourLetters("5667");
			aadhaar.setThirdFourLetters("7890");

			return aadhaar;

		}

		aadhaar.setFirstFourLetters(input.substring(0, 4));
		aadhaar.setSecondFourLetters(input.substring(4, 8));
		aadhaar.setThirdFourLetters(input.substring(9, 12));

		return aadhaar;
	}

}
