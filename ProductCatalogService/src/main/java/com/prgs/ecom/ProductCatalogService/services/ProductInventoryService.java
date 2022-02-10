package com.prgs.ecom.ProductCatalogService.services;

import com.prgs.ecom.ProductCatalogService.Product;

import org.springframework.stereotype.Service;

@Service // IOC
public class ProductInventoryService {
  
  public int checkProductAvailability(Product product) {
    // check the Inventory table in database
    return 1;
  }

  // Once an order is created - reduce the quantity in inventory
  public boolean purchase(Product product, int quantity) {

    return true;
  }
}
