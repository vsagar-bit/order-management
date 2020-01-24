package com.ecom.ordermanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class City {

    @Id
    private String id;
    private String name;
    private String description;
    private String stateId;
    private String cityTypeId;
    private String active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCityTypeId() {
        return cityTypeId;
    }

    public void setCityTypeId(String cityTypeId) {
        this.cityTypeId = cityTypeId;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", stateId='" + stateId + '\'' +
                ", cityTypeId='" + cityTypeId + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}
