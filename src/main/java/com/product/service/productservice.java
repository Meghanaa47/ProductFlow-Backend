package com.product.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.product.model.Product;
import com.product.repo.productrepo;

@Service
public class productservice {
	@Autowired
   private productrepo repo;

   public List<Product> getAllProducts() {
	return repo.findAll();
   }

   public Product addProduct(Product product) {
	  return repo.save(product);
   }

   public Product getById(int id) {
	return repo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Product not found with id "+id));
   }

   public Product updateProduct(int id, Product product) {
	   Product flag=getById(id);
	   flag.setName(product.getName());
	   flag.setPrice(product.getPrice());
	   flag.setCategory(product.getCategory());
	   return repo.save(flag);
   }

   public void deleteProduct(int id) {
		    Product existing = getById(id);
		    repo.delete(existing);
   }
   
   public List<Product> searchProducts(String keyword) {
	    return repo.searchByName(keyword);
	}


   public List<Product> getProductsInRange(int min, int max) {
	    return repo.findByPriceRange(min, max);
	}

   public List<Product> getByCategoryAndPrice(String category, int price) {
	return repo.findByCategoryAndPrice(category,price);
   }

   public String updatePrice(int id, int price) {
	int updated=repo.updatePrice(id,price);
	if(updated==0) throw new RuntimeException("Product not found");
	return "Updated Successfully";
   }

   public List<Product> addProducts(List<Product> products) {
	  return repo.saveAll(products);
   }

   public Product getHighProduct() {
	  return repo.getHighProduct();
   }

   public List<Object[]> countByCategory() {
	   return repo.countByCategory();
   }
   
}
