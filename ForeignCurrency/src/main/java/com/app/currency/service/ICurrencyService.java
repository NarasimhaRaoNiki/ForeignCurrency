package com.app.currency.service;

import org.springframework.http.ResponseEntity;

import com.app.currency.pojo.CurrencyModel;
import com.app.currency.pojo.ResponseObject;


public interface ICurrencyService {
	

	public ResponseObject getLastSixMonthsCurrencyRate();

	public ResponseEntity<CurrencyModel>  getOneMonthCurrencyInfo(String requiredDate);

}
