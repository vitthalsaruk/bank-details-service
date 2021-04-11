package com.bankPayeeMgmt.bankdetailsservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankPayeeMgmt.bankdetailsservice.model.BankDetails;
import com.bankPayeeMgmt.bankdetailsservice.repository.BankDetailsRepository;

@Service
public class BankDetailsServiceImpl implements BankDetailsService {

	@Autowired
	private BankDetailsRepository bankDetailsRepository;
	
	@Override
	public List<BankDetails> getAllBankDetails() {
		
		return bankDetailsRepository.findAll();
	}

	@Override
	public BankDetails getBankDetailsById(String payeeAccountNumber) {
		String bankCode = getBankCodeFromPayeeAccountNumber(payeeAccountNumber);
		return bankDetailsRepository.findById(bankCode).get();
	}

	private String getBankCodeFromPayeeAccountNumber(String payeeAccountNumber) {
		
		return payeeAccountNumber.substring(4,8);
	}

}
