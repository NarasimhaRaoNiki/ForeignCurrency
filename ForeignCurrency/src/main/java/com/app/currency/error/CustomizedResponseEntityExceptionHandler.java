package com.app.currency.error;

import javax.servlet.http.HttpServletRequest;

import org.junit.platform.commons.util.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Information") 
public class CustomizedResponseEntityExceptionHandler
		extends ResponseEntityExceptionHandler {

	  public static final String DEFAULT_ERROR_VIEW = "error";

	  @ExceptionHandler(value = Exception.class)
	  public ModelAndView
	  defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
	    if (AnnotationUtils.findAnnotation
	                (e.getClass(), ResponseStatus.class) != null)
	      throw e;

	    // Otherwise setup and send the user to a default error-view.
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", e);
	    mav.addObject("url", req.getRequestURL());
	    mav.setViewName(DEFAULT_ERROR_VIEW);
	    return mav;
	  }
	
}  