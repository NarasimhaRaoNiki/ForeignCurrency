package com.app.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.app.currency.pojo.CurrencyModel;
import com.app.currency.pojo.ResponseObject;
import com.app.currency.service.ICurrencyService;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

@RestController
@ApiModel(description = "currency response handler ")
public class ForeignCurrencyController {

	@Autowired
	public RestTemplate restTemplate;

	@Autowired
	private ICurrencyService currencyService;

	@Value("${rest.api.consume}")
	private String restApi;

	private String requiredDate;

	public ForeignCurrencyController() {
		Calendar cal = Calendar.getInstance();
		Date todayDate = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		requiredDate = sdf.format(todayDate);
	}

	/**
	 * This method is displaying the last six month currency information from
	 * today's date
	 */
	@GetMapping("/last-sixmonths-info")
	@ApiOperation(value = "six month currency information", notes = "last six month currency information from today's date")
	public ModelAndView  getSixMonthsCurrencyInfo(ModelMap model) {
		ResponseObject lastSixMonthsCurrencyRate = currencyService.getLastSixMonthsCurrencyRate(restApi);
		List<ResponseObject> aList = new ArrayList<>();
		aList.add(lastSixMonthsCurrencyRate);
		model.put("currencyObj", aList);
		return new ModelAndView("last-sixmonths-info");
	}

	/**
	 * This method is displaying the pressent month currency information
	 */
	@GetMapping("/")
	@ApiOperation(value = "current month info", notes = "This method is displaying the pressent month currency information")
	public ModelAndView  getPresentMonthsCurrencyInfo(ModelMap model) {
		CurrencyModel oneMonthCurrencyInfo = currencyService.getOneMonthCurrencyInfo(restApi, requiredDate);
		List<CurrencyModel> aList = new ArrayList<>();
		aList.add(oneMonthCurrencyInfo);
		model.put("currencyObj", aList);
		return new ModelAndView ("presentCurrency");
	}
}
