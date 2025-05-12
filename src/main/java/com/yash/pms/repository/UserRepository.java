package com.yash.pms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.pms.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //Optional<User> findByUsername(String username);
    //User findByUsername(String username);

	Optional<User> findByEmail(String email);
	
	User findByEmailAndPassword(String email,String password );

	Optional<User> findByUsername(String username);
	 
	Boolean existsByUsername(String username);
	
	Boolean existsByEmail(String email);
}
