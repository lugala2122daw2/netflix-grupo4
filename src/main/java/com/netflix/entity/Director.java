package com.netflix.entity;

import javax.persistence.*;

@Entity
public class Director {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    
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
    
    public Director() {
    }

    public Director(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
