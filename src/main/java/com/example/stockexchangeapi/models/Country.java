package com.example.stockexchangeapi.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Country {
    @Id
    private String id;
    private String stockExchange;
    private String sector;
    private String company;

    public String getCompany() {
        return company;
    }

    public String getId() {
        return id;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public String getSector() {
        return sector;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
