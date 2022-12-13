package com.example.demo.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.DTO.Customer;
import com.example.demo.DTO.Employment;
import com.example.demo.DTO.Payment;
import com.example.demo.DTO.Product;
import com.example.demo.DTO.Proofs;
import com.example.demo.Helpers.HibernateUtils;

@Repository
public class CustomerRepository {

	private SessionFactory factory = HibernateUtils.getFactoryInstance();

	@Transactional
	public void saveCustomerDataInRepo(Customer customer, Product product, Employment employment, Payment payment,
			Proofs proof) {

		Session session = factory.openSession();

		session.beginTransaction();

		product.setCustomer(customer);

		employment.setCustomer(customer);

		payment.setCustomer(customer);

		proof.setCustomer(customer);

		session.save(product);

		session.save(employment);

		session.save(payment);

		session.save(proof);

		session.getTransaction().commit();

		displayMessage("saveCustomerDataInRepo....");

		session.close();

	}

	public static void displayMessage(String methodName) {

		System.out.println("Data Added successfully " + methodName);
	}

}
