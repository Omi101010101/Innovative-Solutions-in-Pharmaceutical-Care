package com.returnordermanag.webPortal.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomErrorController implements ErrorController {

  @RequestMapping("/error")
  @ResponseBody
  public String handleError(HttpServletRequest request) {
      Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
      Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
      return String.format("<html><head>"
      		+ "<style>"
      		+ "body  {"
      		+ "  background-image: url(\"https://securionpay.com/wp-content/uploads/2018/09/credit-card-decline-codes1.png\");"
      		+ "}"
      		
      		+ "</style>"
      		+ "</head><body style=\"background-color:powderblue;\"><br><br><center><h1 style=\"color:red;\">Invalid credit card details !!! <h1>"
      		+ "<br> <br><br><br><br><br><br><br><br><h2>The credit card number you have entered is incorrect. Please check your card and try again...<h2>"
      		+ "<h2><a href=\"http://localhost:8080/cardDetails\">Click here to try again</a></h2>"
    		  +"<center><body></html>",
              statusCode, exception==null? "N/A": exception.getMessage());
  }

  @Override
  public String getErrorPath() {
      return "/error";
  }
}