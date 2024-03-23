package com.mettasocial.CurrencyWorld.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CountryNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="country doesn't exist")
	public void handleExp() {
		//return new ResponseEntity<String>("Player not found",HttpStatus.NOT_FOUND);
	}
}
