package com.app.controller;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.app.currency.pojo.CurrencyModel;
import com.app.currency.pojo.ResponseObject;
import com.app.currency.service.ICurrencyService;

@RestController
public class ForeignCurrencyController {
	

	@Autowired
	public RestTemplate restTemplate;
	
	@Autowired
	private ICurrencyService currencyService;
	
	 @Autowired
	 private Environment environment;
	    
	
	Calendar cal = Calendar.getInstance();
	Date todayDate = cal.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
	String requiredDate = sdf.format(todayDate);
	String restConsumeURL = environment.getProperty("rest.api.consume");
	
	/* This method is displaying the last six month currency information from today's date*/
	@GetMapping("/LastSixMonths")
	public ModelAndView getSixMonthsCurrencyInfo(Model model) {
		ResponseObject lastSixMonthsCurrencyRate = currencyService.getLastSixMonthsCurrencyRate(restConsumeURL);
			ArrayList aList =new ArrayList();
			aList.add(lastSixMonthsCurrencyRate);
            model.addAttribute("currencyObj",aList);
        return new ModelAndView("pastSixMonthsCurrency");
    }
	
	/* This method is displaying the pressent month currency information */
	@GetMapping("/")
	public ModelAndView getPresentMonthsCurrencyInfo(Model model) {
		ResponseEntity<CurrencyModel> oneMonthCurrencyInfo = currencyService.getOneMonthCurrencyInfo(restConsumeURL,requiredDate);
		ArrayList aList =new ArrayList();
		aList.add(oneMonthCurrencyInfo.getBody());
        model.addAttribute("currencyObj",aList);
		 return new ModelAndView("presentCurrency");
    }
}
