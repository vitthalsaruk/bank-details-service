package com.bankPayeeMgmt.bankdetailsservice.ExceptionHandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHnadler {
	
	@ExceptionHandler(RuntimeException.class)
	public String testException(Exception e) {
		return e.getMessage();
	}

}
