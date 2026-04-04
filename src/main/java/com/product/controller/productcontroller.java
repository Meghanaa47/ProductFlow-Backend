package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.product.model.Product;
import com.product.service.productservice;

@RestController
@RequestMapping("/product")
public class productcontroller {

    @Autowired
    private productservice service;

    @GetMapping("/hello")
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("Hello Meghana");
    }

    @GetMapping("/allproducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(service.getAllProducts());
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product saved = service.addProduct(product);
        // return 201 Created with the saved product
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
    @PostMapping("/addAll")
    public ResponseEntity<List<Product>> addProducts(@RequestBody List<Product> products) {
        List<Product> savedProducts = service.addProducts(products);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProducts);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<Product> getProById(@PathVariable int id) {
        Product product = service.getById(id);
        return ResponseEntity.ok(product);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {
        Product updated = service.updateProduct(id, product);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
        return ResponseEntity.ok("Product deleted successfully");
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<Product>> search(@RequestParam String keyword) {
        return ResponseEntity.ok(service.searchProducts(keyword));
    }
    
    @GetMapping("/filter")
	public ResponseEntity<List<Product>> filter(@RequestParam int min,@RequestParam int max) {
	    return ResponseEntity.ok(service.getProductsInRange(min, max));
	}
    
    @GetMapping("/category-price")
    public ResponseEntity<List<Product>> getByCategoryAndPrice(@RequestParam String category, @RequestParam int price){
    	return ResponseEntity.ok(service.getByCategoryAndPrice(category,price));
    }
    
    @GetMapping("/update-price")
    public ResponseEntity<String> updatePrice(@RequestParam int id, @RequestParam int price){
    	return ResponseEntity.ok(service.updatePrice(id,price));
    }
    @GetMapping("/countbycategory")
    public ResponseEntity<List<Object[]>> countByCategory(){
    	return ResponseEntity.ok(service.countByCategory());
    }
    @GetMapping("/highpriceproduct")
    public ResponseEntity<Product> getHighProduct(){
    	return ResponseEntity.ok(service.getHighProduct());
    }
}