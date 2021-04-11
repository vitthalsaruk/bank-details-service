package com.bankPayeeMgmt.bankdetailsservice.ExceptionHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHnadler extends ResponseEntityExceptionHandler{
	@Autowired
	private ErrorResponse errorResponse;
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> RuntimeExceptionHandler(Exception e) {
		errorResponse.setErrorCode("BankError");
		errorResponse.setErrorMessage(e.getMessage());
		return new ResponseEntity<>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@Override
	protected final ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException e,                                     
            final HttpHeaders headers, 
            final HttpStatus status, 
            final WebRequest request) {
			errorResponse.setErrorCode("ValidationError");
			errorResponse.setErrorMessage(e.getMessage());
			return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);

		}

}
