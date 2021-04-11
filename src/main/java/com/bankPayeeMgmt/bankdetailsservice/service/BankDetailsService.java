package com.bankPayeeMgmt.bankdetailsservice.service;

import java.util.List;

import com.bankPayeeMgmt.bankdetailsservice.model.BankDetails;

public interface BankDetailsService {
	List<BankDetails> getAllBankDetails();
	BankDetails getBankDetailsById(String payeeAccountNumber);

}
