package com.example.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proofs")
public class Proofs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "proofId")
	private int proofId;

	@Embedded
	@Column(name = "aadhaar")
	private Aadhaar aadhaar;

	@Embedded
	@Column(name = "pancard")
	private Pancard pancard;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Aadhaar getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(Aadhaar aadhaar) {
		this.aadhaar = aadhaar;
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	@Override
	public String toString() {
		return "Proofs [proofId=" + proofId + ", aadhaar=" + aadhaar + ", pancard=" + pancard + ", customer=" + customer
				+ "]";
	}

}
