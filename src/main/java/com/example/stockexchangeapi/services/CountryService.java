package com.example.stockexchangeapi.services;

import com.example.stockexchangeapi.models.Country;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class CountryService {
    private List<Country> listOfCountries = Arrays.asList(
            new Country("USA","NASDAQ","Electronic technology","APPL"),
            new Country("United Kingdom","FTSE","Finance","BARC"),
            new Country("Germany","DAX","Luxury goods","BMWG"),
            new Country("France","CAC","Services","CARR")
            );
    public List<Country> getAllCountries(){
        return listOfCountries;
    }
}
