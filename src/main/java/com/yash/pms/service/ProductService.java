package com.yash.pms.service;

import java.util.List;
import java.util.Optional;

import com.yash.pms.exception.ResourceNotFoundException;
import com.yash.pms.model.Category;
import com.yash.pms.model.Product;
import com.yash.pms.model.User;
import com.yash.pms.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private CategoryService categoryService;
    private UserService userService;

    @Autowired
    public ProductService(ProductRepository productRepository,
                          CategoryService categoryService,
                          UserService userService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
        this.userService = userService;
    }

    public Page<Product> getAllProduct(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
    
  /*  public List<Product> getAllProduct(String username) {
        Optional<User> user = userService.getUserByUsername(username);
        List<Product> products = productRepository.findByUser(user);

        return products;
    }*/

    public Product saveProduct(Product product, String username) throws Exception {
    	
    	//product = this.getByName(product.getName());
    	System.out.println("getByName "+getByName(product.getName()));
        if(getByName(product.getName()) == null) 
        {
	        Category category = categoryService.getCategoryByName(product.getCategory().getCategoryName());
	        product.setCategory(category);
	        if (username != null) {
	           Optional<User> user = userService.getUserByUsername(username);
	        //   product.setUser(user);
	        }
	        productRepository.save(product);
	        
	        return product;
        }
        else
        {
        	System.out.println("Product Already present.");

    		throw new Exception("Product Already present."); 
        }
    }
    
    public Product updateProduct(Integer id, Product updateProduct, String username) {
       Optional<Product> product = getProductById(id);
       
       Category category = categoryService.getCategoryByName(updateProduct.getCategory().getCategoryName());
       updateProduct.setCategory(category);
       if (username != null) {
          Optional<User> user = userService.getUserByUsername(username);
       //   updateProduct.setUser(user);
       }
       productRepository.save(updateProduct);
  	   
  	   return updateProduct;
    }

    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }

    public Optional<Product> getProductById(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        
        if (product == null) {
        	throw new ResourceNotFoundException("Product not found.");
        }
        
        return product;
    }
    public Product getByName(String username) {
    	Product product = productRepository.findByName(username);
		
		return product;
	}

}
