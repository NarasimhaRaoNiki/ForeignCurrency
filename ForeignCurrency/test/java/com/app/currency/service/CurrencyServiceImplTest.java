package com.app.currency.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.notNull;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.app.currency.pojo.CurrencyModel;
import com.app.currency.pojo.Rates;
import com.app.currency.pojo.ResponseObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CurrencyServiceImplTest {

	@MockBean
	private RestTemplate restTemplate;

	@Autowired
	private ICurrencyService service;

	List<Double> uk = new ArrayList<>();
	List<Double> usa = new ArrayList<>();
	List<Double> hk = new ArrayList<>();
	ResponseObject response = new ResponseObject();
	
	
	@Test
	public void getOneMonthCurrencyInfoTest() {

		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		CurrencyModel currencyModel = new CurrencyModel();
		Rates rates = new Rates();
		rates.setGBP(20.0);
		rates.setUSD(30.2);
		rates.setHKD(40.2);
		currencyModel.setRates(rates);
		ResponseEntity<CurrencyModel> myEntity = new ResponseEntity<>(currencyModel, header, HttpStatus.OK);

		Mockito.when(restTemplate.exchange(Matchers.anyString(), Matchers.any(HttpMethod.class),
				Matchers.any(HttpEntity.class), Matchers.<Class<CurrencyModel>>any(), (Object[]) Matchers.anyVararg()))
				.thenReturn(myEntity);

		CurrencyModel c = service.getOneMonthCurrencyInfo("testData", "testData");

		assertEquals(new Double(20.0), c.getRates().getGBP());
	}
	
	@Test
	public void getLastSixMonthsCurrencyRate() {
		
		
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
		ResponseObject rObject=new ResponseObject();
	    ArrayList dummyValues=new ArrayList();
	    dummyValues.add("12.0");
	    dummyValues.add("15.32");
		rObject.setHk(dummyValues);
	    rObject.setUk(dummyValues);
	    rObject.setUsa(dummyValues);		
	    
		ResponseEntity<ResponseObject> myEntity = new ResponseEntity<>(rObject, header, HttpStatus.OK);

		Mockito.when(restTemplate.exchange(Matchers.anyString(), Matchers.any(HttpMethod.class),
				Matchers.any(HttpEntity.class), Matchers.<Class<ResponseObject>>any(), (Object[]) Matchers.anyVararg())).thenReturn(myEntity);
		ResponseObject  resEntity = service.getLastSixMonthsCurrencyRate("testData");
		assertEquals(notNull(), resEntity);
		
	}

}
