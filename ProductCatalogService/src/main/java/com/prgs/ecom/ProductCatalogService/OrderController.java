package com.prgs.ecom.ProductCatalogService;

import com.prgs.ecom.ProductCatalogService.services.ProductInventoryService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class OrderController {

  // @Autowired // DI not testable
  private ProductInventoryService inventoryService;

  @Autowired  // DI 1st pref
  public OrderController(ProductInventoryService inventoryService) {
    this.inventoryService = inventoryService;
  }

  /*
  @Autowired  // DI 2nd pref
  setService(ProductInventoryService inventoryService) {
    this.inventoryService = inventoryService
  }*/

  @PostMapping("/submit-order")
  public String submitOrder(@RequestBody Order order) {

    if(inventoryService.checkProductAvailability(Order.getProduct()) == 0) {
      throw new Exception("Out of stock");
    }

    if(!isValidCC(order.getCC())) {
      throw new Exception("Invalid CC");
    }

    chargeCC(order.getCC());
    createOrder(order);

    return "success";
  }
}
