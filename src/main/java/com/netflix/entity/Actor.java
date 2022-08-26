package com.netflix.entity;

import javax.persistence.*;

@Entity
public class Actor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    Title title;
    
    public Actor() {
    }

    public Actor(int id, String name, Title title) {
        this.id = id;
        this.name = name;
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

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

}
