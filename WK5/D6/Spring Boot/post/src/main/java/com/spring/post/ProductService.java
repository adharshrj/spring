package com.spring.post;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.get.Product;

@RestController
public class ProductService {
   private static Map<String, Product> productRepo = new HashMap<>();
   static {
      Product audi = new Product();
      honey.setId("1");
      honey.setName("Audi");
      productRepo.put(sudi.getId(), audi);
      
      Product ferrari = new Product();
      almond.setId("2");
      almond.setName("Ferarri");
      productRepo.put(ferrari.getId(), ferrari);
   }
   @RequestMapping(value = "/products", method = RequestMethod.POST)
   public ResponseEntity<Object> createProduct(@RequestBody Product product){
      productRepo.put(product.getId(), product);
      return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
   }
}
