package com.bankPayeeMgmt.bankdetailsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankPayeeMgmt.bankdetailsservice.model.BankDetails;
import com.bankPayeeMgmt.bankdetailsservice.repository.BankDetailsRepository;

@SpringBootApplication(scanBasePackages = "com.bankPayeeMgmt.bankdetailsservice")
public class BankDetailsServiceApplication implements ApplicationRunner {

	@Autowired
	private BankDetailsRepository bankDetailsRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BankDetailsServiceApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		bankDetailsRepository.save(new BankDetails("1001","ICICI Bank"));
		bankDetailsRepository.save(new BankDetails("1002","HDFC Bank"));
		bankDetailsRepository.save(new BankDetails("1003","SBI Bank"));
		bankDetailsRepository.save(new BankDetails("1004","AXIS Bank"));
		
	}
}
