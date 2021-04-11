package com.bankPayeeMgmt.bankdetailsservice.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankPayeeMgmt.bankdetailsservice.model.BankDetails;
import com.bankPayeeMgmt.bankdetailsservice.service.BankDetailsService;
import com.sun.istack.NotNull;

@RestController
@RequestMapping("/bankDetails")
public class BankDetailsController {
	
	@Autowired
	private BankDetailsService bankDetailsService;
	
	@GetMapping("/{payeeAccountNumber}")
	public BankDetails getBankById(@PathVariable @NotNull String payeeAccountNumber) {
		//try {
			return bankDetailsService.getBankDetailsById(payeeAccountNumber);
			/*
			 * }catch(Exception e) { throw new RuntimeException(); }
			 */
	}
	
	@RequestMapping("/ping")
	public String ping() {
		return "Service is up";
	}

}
