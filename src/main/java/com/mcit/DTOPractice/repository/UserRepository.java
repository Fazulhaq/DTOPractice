package com.mcit.DTOPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcit.DTOPractice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
