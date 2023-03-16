package com.wittybrains.busbookingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wittybrains.busbookingsystem.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//@Query("SELECT * FROM user WHERE username = :username")

    Optional<User> findByUsername(String username);
}

