package com.example.stockexchangeapi.services;

import com.example.stockexchangeapi.models.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class CountryService {
    private List<Country> listOfCountries = new ArrayList<>(Arrays.asList(
            new Country("USA","NASDAQ","Electronic technology","APPL"),
            new Country("United Kingdom","FTSE","Finance","BARC"),
            new Country("Germany","DAX","Luxury goods","BMWG"),
            new Country("France","CAC","Services","CARR")
            ));
    public List<Country> getAllCountries(){
        return listOfCountries;
    }

    public Country getCountry(String id) {
        return listOfCountries.stream().filter(country->country.getId().equals(id)).findFirst().get();
    }

    public void addCountry(Country country){
        listOfCountries.add(country);
    }

    public void updateCountry(String id, Country country) {
        for (int i=0;i<listOfCountries.size();i++){
            Country c =listOfCountries.get(i);
            if (c.getId().equals(id))listOfCountries.set(i,country);
        }
    }

    public void deleteCountry(String id){
        listOfCountries.removeIf(country->country.getId().equals(id));
    }
}
