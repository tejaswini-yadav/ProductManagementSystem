package com.yash.pms.controller;

import java.util.Optional;

import com.yash.pms.model.Product;
import com.yash.pms.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Implementation of Curd(Add,Update and Delete) opertaion and getting lists.
 * This implementation for Product
 * @author TejaswiniY
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")  
@RequestMapping("/pmsapi")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//Get all Product 
 /*  @GetMapping(path = "/products")
   public List<Product> getAllProduct(Authentication authentication) {
       String username = authentication.getName();
	   List<Product> productList =  productService.getAllProduct(username);
	   
	   return productList;
   }*/
   
	//Get Product base on product id
   @GetMapping(path = "/products/{id}")
   public Optional<Product> getProduct(@PathVariable Integer id) {
	   Optional<Product> product = productService.getProductById(id);
	   
	   return product;
   }
   
	//Add Product
   @PostMapping("/prodsAdd")
   public Product saveProduct(@RequestBody Product newProduct, Authentication authentication) throws Exception {
       String username = authentication.getName();

       return productService.saveProduct(newProduct, username);
   }
   
	//Delete Product
   @DeleteMapping(path = "/prodsDel/{id}")
   public void deleteProduct(@PathVariable Integer id) {
	   productService.deleteProductById(id);
   }
   
	//Update Product
   @PutMapping("/prodsUpd/{id}")
   public Product updateProduct(@PathVariable Integer id, @RequestBody Product updateProduct, Authentication authentication) {
	   String username = authentication.getName();
	  return productService.updateProduct(id,updateProduct, username);
   }
}
