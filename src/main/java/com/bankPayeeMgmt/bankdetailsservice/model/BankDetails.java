package com.bankPayeeMgmt.bankdetailsservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BankDetails {
	
	@Id
	private String bankCode;
	private String bankName;
	
	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public BankDetails() {
		
	}
	
	public BankDetails(String bankCode, String bankName) {
		this.bankCode = bankCode;
		this.bankName = bankName;
	}

	

}
