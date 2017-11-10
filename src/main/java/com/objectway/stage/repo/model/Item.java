package com.objectway.stage.repo.model;

import java.io.Serializable;

public class Item implements Serializable {

    private Integer idRef;
    private String name;
    private String description;
    private Float price;
    private Integer amount;


    public Integer getIdRef() { return idRef;}

    public void setIdRef(Integer idRef) {this.idRef = idRef;}

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public String getDescription() { return description;}

    public void setDescription(String description) { this.description = description;}

    public Float getPrice() { return price;}

    public void setPrice(Float price) { this.price = price;}

    public Integer getAmount() { return amount;}

    public void setAmount(Integer amount) { this.amount = amount;}

}
