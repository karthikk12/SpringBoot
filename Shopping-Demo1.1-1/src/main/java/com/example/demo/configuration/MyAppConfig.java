package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.Formatters.AadhaarFormatter;
import com.example.demo.Formatters.CardDetailsFormatter;
import com.example.demo.Formatters.PanCardFormatter;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

	@Override
	public void addFormatters(FormatterRegistry registry) {

		registry.addFormatter(new CardDetailsFormatter());
		registry.addFormatter(new AadhaarFormatter());
		registry.addFormatter(new PanCardFormatter());

		System.out.println("Registry Process Done...");
	}

}
