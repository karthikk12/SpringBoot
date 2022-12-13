package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.Customer;
import com.example.demo.DTO.Employment;
import com.example.demo.DTO.Payment;
import com.example.demo.DTO.Product;
import com.example.demo.DTO.Proofs;
import com.example.demo.dao.CustomerRepository;

@Controller
@SessionAttributes(names = "proofBundle")
public class ProofController {

	@Autowired
	private CustomerRepository repo;

	@RequestMapping(path = "/proofLogin")
	public String proofLoginPage(Model model) {

		model.addAttribute("proofBundle", new Proofs());

		return "proofLoginPage";
	}

	@RequestMapping(path = "/proofPageSaver")
	public String proofProcessorPage(@Valid @ModelAttribute("proofBundle") Proofs proof, BindingResult result,
			@SessionAttribute("productBundle") Product product, @SessionAttribute("personalBundle") Customer customer,
			@SessionAttribute("employmentBundle") Employment employment,
			@SessionAttribute("paymentBundle") Payment payment) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(n -> System.out.println(n));
		}

		repo.saveCustomerDataInRepo(customer, product, employment, payment, proof);

		return "displayFullPage";

	}
}
