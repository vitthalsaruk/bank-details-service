package com.bankPayeeMgmt.bankdetailsservice.controller;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankPayeeMgmt.bankdetailsservice.service.BankDetailsService;

@RestController
@RequestMapping("/bankDetails")
public class BankDetailsController {
	
	@Autowired
	private BankDetailsService bankDetailsService;
	
	@GetMapping("/{payeeAccountNumber}")
	public ResponseEntity<?> getBankById(@PathVariable String payeeAccountNumber) {
		
		return bankDetailsService.getBankDetailsById(payeeAccountNumber); 
		 		
	}
	
	@RequestMapping("/ping")
	public String ping() {
		return "Service is up";
	}

}
