package com.mcit.DTOPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcit.DTOPractice.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
    
}
