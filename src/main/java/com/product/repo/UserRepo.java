package com.product.repo;
import com.product.model.UserEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Integer>{
	 

	 Optional<UserEntity> findByUsername(String username);
}
