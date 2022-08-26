package com.netflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.entity.Title;

public interface TitleRepository extends JpaRepository<Title, Integer>{
    
}
