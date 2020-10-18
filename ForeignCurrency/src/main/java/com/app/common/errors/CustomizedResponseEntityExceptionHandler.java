package com.app.common.errors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler
		extends ResponseEntityExceptionHandler {/*
												 * 
												 * @ExceptionHandler(CommonExceptionHandling.class) public final
												 * ResponseEntity<ErrorDetails>
												 * handleUserNotFoundException(CommonExceptionHandling ex, WebRequest
												 * request) { ErrorDetails errorDetails = new ErrorDetails(new Date(),
												 * ex.getMessage(), request.getDescription(false)); return new
												 * ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND); }
												 */

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