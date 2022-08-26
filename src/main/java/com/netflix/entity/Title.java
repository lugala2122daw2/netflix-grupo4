package com.netflix.entity;

import javax.persistence.*;

@Entity
public class Title {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String dateAdded;
    String releaseYear;
    String rating;
    String duration;
    String description;
    float userRating;
    int numRatings;

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

    public TItle() {
    }

    public TItle(int id, String name, String dateAdded, String releaseYear, String rating, String duration,
            String description, float userRating, int numRatings) {
        this.id = id;
        this.name = name;
        this.dateAdded = dateAdded;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.duration = duration;
        this.description = description;
        this.userRating = userRating;
        this.numRatings = numRatings;
    }

}
