package com.yash.pms.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.pms.model.ERole;
import com.yash.pms.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

	  Optional<Role> findByName(ERole name);

}
