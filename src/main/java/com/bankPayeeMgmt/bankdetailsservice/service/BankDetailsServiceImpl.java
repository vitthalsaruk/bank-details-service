package com.bankPayeeMgmt.bankdetailsservice.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> getBankDetailsById(String payeeAccountNumber) {
		
		try {
			String bankCode = getBankCodeFromPayeeAccountNumber(payeeAccountNumber);
			return new ResponseEntity<>(bankDetailsRepository.findById(bankCode).get(),HttpStatus.OK);
		}catch(RuntimeException e) {
			throw new RuntimeException(e);
		}
	}

	private String getBankCodeFromPayeeAccountNumber(String payeeAccountNumber) {
		
		return payeeAccountNumber.substring(4,8);
	}

}
