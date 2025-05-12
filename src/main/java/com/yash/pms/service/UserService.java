package com.yash.pms.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.yash.pms.model.User;
import com.yash.pms.repository.CategoryRepository;
import com.yash.pms.repository.ProductRepository;
import com.yash.pms.repository.UserRepository;


@Service
public class UserService {
	
	private UserRepository userRepository;
	
	private ProductRepository productRepository;
	
	private CategoryRepository categoryRepository;
	
	@Autowired
	public UserService(UserRepository userRepository,
			ProductRepository productRepository,
			CategoryRepository categoryRepository) {
		this.userRepository = userRepository;
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}
	
	public Optional<User> getUserByUsername(String username) {
		Optional<User> user = userRepository.findByUsername(username);
		
		return user;
	}
	public Optional<User> getUserByEmail(String email) {
		Optional<User> user = userRepository.findByEmail(email);
		
		return user;
	}
	
	public User saveUser(User user) {
		User newUser = userRepository.save(user);
		
		return newUser;
	}
	/*public User userLogin(String email) {
		// TODO Auto-generated method stub
		System.out.println(" Email "+email);

	return userRepository.findByEmail(email);	
	}*/

	
	
	/* public User login(User loginRequest) {
		    User user = findUserByCredentials(loginRequest.getUsername(), loginRequest.getPassword());
		    return user.builder()
		      .userId(user.getId())
		      .username(user.getUsername())
		     // .role(user.getRole())
		      //.token(jwtProvider.generateTokenWithUsername(user.getUsername()))
		      .build();
		  }
	 
	 @Transactional(readOnly = true)
	  public User findUserByCredentials(String username, String password) throws ResourceNotFoundException{
	    User user = userRepository.findByUsername(username);
	    user.orElseThrow(() -> new ResourceNotFoundException( "User " + username + " doesn't exist"));
	    if (!passwordEncoder.matches(password, user.getPassword())) throw new ResourceNotFoundException( "Invalid Password");
	    return user;
	  }*/
	
	public ResponseEntity<Map<String, Object>> getCount() {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<>();
    	System.out.println("Count "+categoryRepository.count());
		map.put("category", categoryRepository.count());
		map.put("product", productRepository.count());
		map.put("company", categoryRepository.count());
		
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
}
