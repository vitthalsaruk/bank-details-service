package com.bankPayeeMgmt.bankdetailsservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bankPayeeMgmt.bankdetailsservice.model.BankDetails;

public interface BankDetailsService {
	List<BankDetails> getAllBankDetails();
	ResponseEntity<?> getBankDetailsById(String payeeAccountNumber);

}
