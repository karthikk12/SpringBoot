package com.example.demo.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.demo.DTO.Pancard;

public class PanCardFormatter implements Formatter<Pancard> {

	@Override
	public String print(Pancard object, Locale locale) {
		return null;
	}

	@Override
	public Pancard parse(String input, Locale locale) throws ParseException {

		Pancard pancard = new Pancard();

		if (input.length() > 10 || input.length() < 0) {
			pancard.setFirstFiveAlpha("ABCDE");
			pancard.setSecondFourNumbers("1234");
			pancard.setLastSingleAlpha("H");
			return pancard;
		}

		pancard.setFirstFiveAlpha(input.substring(0, 5));
		pancard.setSecondFourNumbers(input.substring(5, 9));
		pancard.setLastSingleAlpha(input.substring(9, 10));

		return pancard;
	}

}
