package com.yash.pms.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.Category;
import com.yash.pms.service.CategoryService;

/**
 * Implementation of Curd(Add,Update and Delete) operation and getting lists.
 * This implementation for Category
 * @author TejaswiniY
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")  
@RequestMapping("/pmsapi")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	//Get all category 
	@GetMapping(path="/category")
	public List<Category> getAllCategory() {
		List<Category> categoryList = categoryService.getAllCategory();
		
		return categoryList;
	}
	
	//Get category base on category id
	@GetMapping(path="/category/{id}")
	public Optional<Category> getCategoryById(@PathVariable int id) {
		Optional<Category> category = categoryService.getCategoryById(id);
		
		return category;
	}
	
	//Add category
	@PostMapping("/category/Add")
	   public void saveProduct(@RequestBody Category newCategory) {

	     categoryService.saveCategory(newCategory);
	}
	
	//Delete category
	@DeleteMapping(path = "/categoryDel/{id}")
	   public void deleteCategory(@PathVariable Integer id) {
		categoryService.deleteCategoryById(id);
	   }
	
	//Count
	@GetMapping("/categoryCount")
	public ResponseEntity<Map<String,Object>> getCount(){
		return categoryService.getCount();
	}
}
