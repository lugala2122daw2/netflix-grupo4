package com.netflix.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.netflix.entity.Actor;

@RepositoryRestResource(collectionResourceRel = "actor", path = "actor")
public interface ActorRepository extends JpaRepository<Actor, Integer> {
    List<Actor> findActorByNameContains(@Param("name") String name);
}
