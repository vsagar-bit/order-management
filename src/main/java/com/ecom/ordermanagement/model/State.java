package com.ecom.ordermanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class State {

    @Id
    private String id;
    private String countryId;
    private String name;
    private String description;
    private String active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "State{" +
                "id='" + id + '\'' +
                ", countryId='" + countryId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}
