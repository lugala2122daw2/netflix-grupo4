package com.netflix.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Range;

import com.netflix.annotation.YearValidation;

@Entity
@Table(name = "title")
public class Title {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NotNull
    String name;
    @NotNull
    String dateAdded;
    @NotNull
    @YearValidation(minYear = "1900")
    String releaseYear;
    @NotNull
    String rating;
    @NotNull
    String duration;
    @NotNull
    String description;
    @NotNull
    @Range(min=0, max=10)
    float userRating;
    @NotNull
    @Range(min=0)
    int numRatings;

    @ManyToMany
    @JoinTable(name = "title_director",
        joinColumns = 
            @JoinColumn(name = "title_id",nullable = false),
        inverseJoinColumns = 
            @JoinColumn(name = "director_id",nullable = false)
        )
    List<Director> director;

    @ManyToMany
    @JoinTable(name = "title_actor",
        joinColumns = 
            @JoinColumn(name = "title_id",nullable = false),
        inverseJoinColumns = 
            @JoinColumn(name = "actor_id",nullable = false)
        )
    List<Actor> actor;

    @ManyToMany
    @JoinTable(name = "title_category",
        joinColumns = 
            @JoinColumn(name = "title_id",nullable = false),
        inverseJoinColumns = 
            @JoinColumn(name = "category_id",nullable = false)
        )
    List<Category> category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public String getRating() {
        return rating;
    }
    
    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public float getUserRating() {
        return userRating;
    }

    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }

    public int getNumRatings() {
        return numRatings;
    }
    
    public void setNumRatings(int numRatings) {
        this.numRatings = numRatings;
    }

    public Title() {
    }

    public Title(int id, String name, String dateAdded, String releaseYear, String rating, String duration,
            String description, float userRating, int numRatings, List<Director> director, List<Actor> actor, List<Category> category) {
        this.id = id;
        this.name = name;
        this.dateAdded = dateAdded;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
        this.description = description;
        this.userRating = userRating;
        this.numRatings = numRatings;
        this.director = director;
        this.actor = actor;
        this.category = category;
    }

    public List<Director> getDirector() {
        return director;
    }

    public void setDirector(List<Director> director) {
        this.director = director;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

}
