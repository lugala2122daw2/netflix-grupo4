package com.netflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.netflix.entity.Director;

public interface DirectorRepository extends JpaRepository<Director, Integer>{
    
}
