package com.netflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.entity.Director;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface DirectorRepository extends JpaRepository<Director, Integer>{
    @RestResource(path="name", rel="search")
    List<Director> findByNameContains(@Param("q") String name);
    
}
