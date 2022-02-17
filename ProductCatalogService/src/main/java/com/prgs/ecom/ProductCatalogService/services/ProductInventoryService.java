package com.prgs.ecom.ProductCatalogService.services;

import com.prgs.ecom.ProductCatalogService.Product;

import org.springframework.stereotype.Service;

@Service // IOC
public class ProductInventoryService {
  
  @Autowired 
  ProductRepository productRepo;
  public int checkProductAvailability(Product product) {
    Product p = getProductById(product.getId());

    return p.getAvailableQuantity;
  }

  // Once an order is created - reduce the quantity in inventory
  public boolean purchase(Product product, int quantity) {

    return true;
  }

  public Product getProductById(int id) {
    return productRepo.findById(id).get();  
  }
}
