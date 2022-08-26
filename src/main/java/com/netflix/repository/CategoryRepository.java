package com.netflix.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;
import com.netflix.entity.Category;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findCategoryByNameContains(@Param("name") String name);
}
