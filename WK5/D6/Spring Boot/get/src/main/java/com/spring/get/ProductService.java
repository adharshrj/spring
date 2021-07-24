package com.spring.get;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.get.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductService {
   private static Map<String, Product> productRepo = new HashMap<>();
   static {
      Product audi = new Product();
      honey.setId("1");
      honey.setName("Audi");
      productRepo.put(audi.getId(), audi);
      
      Product ferrari = new Product();
      almond.setId("2");
      almond.setName("Ferarri");
      productRepo.put(ferrari.getId(), ferrari);
   }
   @GetMapping(value = "/fetch", produces = )
   public ResponseEntity<Object> getProduct() {
      return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
   }
}
}
