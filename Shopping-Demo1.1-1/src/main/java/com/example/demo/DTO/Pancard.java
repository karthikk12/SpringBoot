package com.example.demo.DTO;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class Pancard {

	private String firstFiveAlpha;

	private String secondFourNumbers;

	private String lastSingleAlpha;

	public String getFirstFiveAlpha() {
		return firstFiveAlpha;
	}

	public void setFirstFiveAlpha(String firstFiveAlpha) {
		this.firstFiveAlpha = firstFiveAlpha;
	}

	public String getSecondFourNumbers() {
		return secondFourNumbers;
	}

	public void setSecondFourNumbers(String secondFourNumbers) {
		this.secondFourNumbers = secondFourNumbers;
	}

	public String getLastSingleAlpha() {
		return lastSingleAlpha;
	}

	public void setLastSingleAlpha(String lastSingleAlpha) {
		this.lastSingleAlpha = lastSingleAlpha;
	}

	@Override
	public String toString() {
		return "Pancard [firstFiveAlpha=" + firstFiveAlpha + ", secondFourNumbers=" + secondFourNumbers
				+ ", lastSingleAlpha=" + lastSingleAlpha + "]";
	}

}
