package com.netflix.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

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
    String releaseYear;
    @NotNull
    String rating;
    @NotNull
    String duration;
    @NotNull
    String description;
    @NotNull
    float userRating;
    @NotNull
    int numRatings;

    @ManyToMany
    @JoinTable(name = "title_director",
        joinColumns = {
            @JoinColumn(name = "title_id", referencedColumnName = "id",
                nullable = false, updatable = false),
            @JoinColumn(name = "director_id", referencedColumnName = "id",
            nullable = false, updatable = false)
        })
    Director director;

    @ManyToMany
    @JoinTable(name = "title_actor",
        joinColumns = {
            @JoinColumn(name = "title_id", referencedColumnName = "id",
                nullable = false, updatable = false),
            @JoinColumn(name = "actor_id", referencedColumnName = "id",
            nullable = false, updatable = false)
        })
    Actor actor;

    @ManyToMany
    @JoinTable(name = "title_category",
        joinColumns = {
            @JoinColumn(name = "title_id", referencedColumnName = "id",
                nullable = false, updatable = false),
            @JoinColumn(name = "category_id", referencedColumnName = "id",
            nullable = false, updatable = false)
        })
    Category category;

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

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
            String description, float userRating, int numRatings, Director director, Actor actor, Category category) {
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

}
