package com.netflix.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NotNull
    String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "category")
    List<Title> title;

    public List<Title> getTitle() {
        return title;
    }

    public void setTitle(List<Title> title) {
        this.title = title;
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

    public Category() {
    }

    public Category(int id, String name, List<Title> title) {
        this.id = id;
        this.name = name;
        this.title = title;
    }

}