package com.bankPayeeMgmt.bankdetailsservice.ExceptionHandling;

import org.springframework.stereotype.Component;

@Component
public class ErrorResponse {
	private String errorCode;
	private String errorMessage;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public ErrorResponse(String errorCode, String errorType, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public ErrorResponse() {
		super();
	}
	
	

}
