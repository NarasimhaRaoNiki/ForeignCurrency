package com.app.currency.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.currency.pojo.CurrencyModel;
import com.app.currency.pojo.ResponseObject;


@Service
public class CurrencyServiceImpl implements ICurrencyService{

	@Autowired
	public RestTemplate restTemplate;
	Calendar cal = Calendar.getInstance();
	
	List<Double> uk = new ArrayList<>();
	List<Double> usa = new ArrayList<>();
	List<Double> hk = new ArrayList<>();
	ResponseObject response = new ResponseObject();
	
	@Override
	public ResponseObject getLastSixMonthsCurrencyRate(String consumeUrl) {
		
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		for (int i = 0; i < 6; i++) {
			cal.add(Calendar.MONTH, -i);
			Date todayDate = cal.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
			String LastSixMothsDate = sdf.format(todayDate);
			ResponseEntity<CurrencyModel> e = restTemplate.exchange(consumeUrl + LastSixMothsDate,
					HttpMethod.GET, entity, CurrencyModel.class);

			uk.add(e.getBody().getRates().getGBP());

			usa.add(e.getBody().getRates().getUSD());

			hk.add(e.getBody().getRates().getHKD());

		}
		response.setUk(uk);
		response.setUsa(usa);
		response.setHk(hk);
		return response;

	}
	
	
   @Override
	public ResponseEntity<CurrencyModel> getOneMonthCurrencyInfo(String consumeUrl,String requiredDate)  {
		
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<CurrencyModel> e = restTemplate.exchange(consumeUrl + requiredDate, HttpMethod.GET,entity,CurrencyModel.class);
		return e;
	}
	  

}
