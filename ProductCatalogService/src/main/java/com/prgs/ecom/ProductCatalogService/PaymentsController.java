package com.prgs.ecom.ProductCatalogService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/*
REST API testing from postman
URL: localhost:8080/credit-card-payment
Request type: POST
body: {
  "number" : "342432343",
  "ccv" : "233",
  "expiry" : "2/25",
  "zip": "23423"
}*/

@RestController
public class PaymentsController {
  
  @PostMapping("/credit-card-payment")
  public String addCreditCard(CreditCard cc) {

    System.out.println("Card number: " + cc.getNumber());
    return "success";
  }
}
