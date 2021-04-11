package com.bankPayeeMgmt.bankdetailsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankPayeeMgmt.bankdetailsservice.model.BankDetails;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, String> {

}
