package com.example.demo.DTO;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class Aadhaar {

	private String firstFourLetters;

	private String secondFourLetters;

	private String thirdFourLetters;

	public String getFirstFourLetters() {
		return firstFourLetters;
	}

	public void setFirstFourLetters(String firstFourLetters) {
		this.firstFourLetters = firstFourLetters;
	}

	public String getSecondFourLetters() {
		return secondFourLetters;
	}

	public void setSecondFourLetters(String secondFourLetters) {
		this.secondFourLetters = secondFourLetters;
	}

	public String getThirdFourLetters() {
		return thirdFourLetters;
	}

	public void setThirdFourLetters(String thirdFourLetters) {
		this.thirdFourLetters = thirdFourLetters;
	}

	@Override
	public String toString() {
		return "Aadhaar [firstFourLetters=" + firstFourLetters + ", secondFourLetters=" + secondFourLetters
				+ ", thirdFourLetters=" + thirdFourLetters + "]";
	}
	
	

}
