package com.netflix.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "actor")
public class Actor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NotNull
    String name;

    @ManyToMany(mappedBy = "actor")
    List<Title> title;
    
    public Actor(int id, @NotNull String name, List<Title> title) {
        this.id = id;
        this.name = name;
        this.title = title;
    }

    public Actor() {
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

    public List<Title> getTitle() {
        return title;
    }

    public void setTitle(List<Title> title) {
        this.title = title;
    }

    

}
