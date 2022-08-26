package com.netflix.repository;

import com.netflix.entity.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import com.netflix.entity.Category;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {


    List<Category> findByNameContains(@Param("q") String name);


}
