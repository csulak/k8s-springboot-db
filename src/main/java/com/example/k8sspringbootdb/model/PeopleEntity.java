package com.example.k8sspringbootdb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "people")
public class PeopleEntity {

    @Id
    private String peopleId;

    private String name;

    private String lastName;

    private String genre;


    public PeopleEntity() {
    }

    public PeopleEntity(String name, String lastName, String genre) {
        this.peopleId = UUID.randomUUID().toString();
        this.name = name;
        this.lastName = lastName;
        this.genre = genre;
    }

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
