package com.yash.pms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yash.pms.model.Category;
import com.yash.pms.repository.CategoryRepository;
import com.yash.pms.repository.RoleRepository;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;
    private RoleRepository roleRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository,RoleRepository roleRepository) {
        this.categoryRepository = categoryRepository;
        this.roleRepository=roleRepository;
    }

    public List<Category> getAllCategory() {
    	System.out.println("Count "+categoryRepository.count());

        return categoryRepository.findAll();
    }
    
    public Optional<Category> getCategoryById(int id) {
    	return categoryRepository.findById(id);
    }

    public Category getCategoryByName(String name) {
        return categoryRepository.findByCategoryName(name);
    }

    public Category saveCategory(Category category) {
    	
    	System.out.println("Name "+category.getCategoryName());
    	categoryRepository.save(category);
  	   	return category;
    }
    
    public void deleteCategoryById(int id) {
    	categoryRepository.deleteById(id);
    }
    /*public void findName() {
   	System.out.println( "Name "+roleRepository.findByName(ERole.ROLE_USER));
    }*/
    
    public ResponseEntity<Map<String, Object>> getCount() {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<>();
    	System.out.println("Count "+categoryRepository.count());

		map.put("category", categoryRepository.count());
		
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
    
}