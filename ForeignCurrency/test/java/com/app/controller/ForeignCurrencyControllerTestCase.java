package com.app.controller;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.app.currency.pojo.CurrencyModel;
import com.app.currency.pojo.ResponseObject;
import com.app.currency.service.ICurrencyService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForeignCurrencyControllerTestCase {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@MockBean
	private ICurrencyService currencyService;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void getPresentMonthsCurrencyInfoTest() throws Exception {

		when(currencyService.getOneMonthCurrencyInfo(Mockito.anyString(), Mockito.anyString()))
				.thenReturn(new CurrencyModel());
		mockMvc.perform(MockMvcRequestBuilders.get("/"));
	}
	
	@Test
	public void getSixMonthsCurrencyInfoTest() throws Exception {

		when(currencyService.getLastSixMonthsCurrencyRate(Mockito.anyString()))
				.thenReturn(new ResponseObject());
		mockMvc.perform(MockMvcRequestBuilders.get("/last-sixmonths-info"))
		;
	}

}
