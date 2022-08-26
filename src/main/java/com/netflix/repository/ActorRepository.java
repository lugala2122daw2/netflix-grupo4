package com.netflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    
}
