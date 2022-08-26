package com.netflix.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;
import com.netflix.entity.Director;

@RepositoryRestResource(collectionResourceRel = "director", path = "director")
public interface DirectorRepository extends JpaRepository<Director, Integer>{
    List<Director> findCDirectorByNameContains(@Param("name") String name);
}
