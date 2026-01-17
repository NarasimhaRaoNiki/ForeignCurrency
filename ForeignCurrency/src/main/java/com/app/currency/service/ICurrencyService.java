package com.app.currency.service;

import com.app.currency.pojo.CurrencyModel;
import com.app.currency.pojo.ResponseObject;


public interface ICurrencyService {
	

	public ResponseObject getLastSixMonthsCurrencyRate(String consumeUrl);

	public CurrencyModel  getOneMonthCurrencyInfo(String consumeUrl,String requiredDate);

}
