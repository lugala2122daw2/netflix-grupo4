package com.netflix.repository;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;
import com.netflix.entity.Title;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "title", path = "title")
public interface TitleRepository extends JpaRepository<Title, Integer>{

    List<Title> findTitlesByNameContains(@Param("q") String name);

    List<Title> findTitleByDirectorName(@Param("q") String director);

    List<Title> findTitleByActorName(@Param("q") String actor);

    List<Title> findTitleByCategoryName(@Param("q") Integer categoryId);

    List<Title> findTitleByNameContains(@Param("q") String name, Pageable pageable);

    List<Title> findTitleByReleaseYear(@Param("q") Integer year, Pageable pageable);

    List<Title> findTitleByDescription(@Param("q") String description, Pageable pageable);

    @Query(value = "SELECT * FROM title  t ORDER BY t.user_rating DESC", nativeQuery = true)
    List<Title> findTopRating(PageRequest pageRequest);

    //Select from title where the category its given by url
    @Query(value = "select t.*, c.name\n" +
            "from title t\n" +
            "inner join title_category tc on t.id = tc.title_id\n" +
            "inner join category c on tc.category_id = c.id\n" +
            "where c.id=?1\n" +
            "order by t.user_rating desc", nativeQuery = true)
    List<Title> findTopRatingCategory(PageRequest pageRequest, Integer id);

    @Query(value = "select * from title where category_id = ?0 order by user_rating desc", nativeQuery = true)
    List<Title> findTop10ByCategoriesContainingOrderByUser_ratingDesc(Integer category_id, Pageable pageable);
}
