package com.example.stockexchangeapi.models;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class Country {
    private String name;
    private String stockExchange;
    private String sector;
    private String company;

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public String getSector() {
        return sector;
    }
}
