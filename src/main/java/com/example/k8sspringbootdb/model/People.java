package com.example.k8sspringbootdb.model;


import java.io.Serializable;

public class People implements Serializable {
    private static final long serialVersionUID = -4987350379494141985L;
    private String peopleId;

    private String name;

    private String lastName;

    private String genre;


    public People() {
    }


    public People(String peopleId, String name, String lastName, String genre) {
        this.peopleId = peopleId;
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

