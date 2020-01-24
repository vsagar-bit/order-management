package com.ecom.ordermanagement.model;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class ShoppingCart {

    @Id
    private long id;
    private String sessionId;
    private Date date;
    private List<Product> products;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", sessionId='" + sessionId + '\'' +
                ", date=" + date +
                ", products=" + products +
                '}';
    }
}
