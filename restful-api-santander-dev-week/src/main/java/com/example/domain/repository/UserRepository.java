package com.example.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	//Do a join in another table 'Account'
	boolean existsByAccountNumber(String accountNumber);

}
