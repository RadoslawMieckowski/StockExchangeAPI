package com.example.stockexchangeapi.models;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class Country {
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
}
