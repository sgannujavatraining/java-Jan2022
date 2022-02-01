package com.prgs.ecom.ProductCatalogService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
   this is multi line
   comment
   ----
  */
@RestController
public class ProductsController {

	@GetMapping("/list-products")
	public List<Product> listProducts() {

		// what is list? (single line comment)
		List<Product> listOfProducts = new ArrayList<>();
		Product mask1 = new Product();
		mask1.setName("kids mask");
		mask1.setPrice(20);

		Product mask2 = new Product();
		mask2.setName("Designer mask with led");
		mask2.setPrice(50);

		listOfProducts.add(mask1);
		listOfProducts.add(mask2);

		return listOfProducts;
	}
}
