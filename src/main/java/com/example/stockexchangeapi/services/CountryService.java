package com.example.stockexchangeapi.services;

import com.example.stockexchangeapi.models.Country;
import com.example.stockexchangeapi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
//    private List<Country> listOfCountries = new ArrayList<>(Arrays.asList(
//            new Country("USA","NASDAQ","Electronic technology","APPL"),
//            new Country("United Kingdom","FTSE","Finance","BARC"),
//            new Country("Germany","DAX","Luxury goods","BMWG"),
//            new Country("France","CAC","Services","CARR")
//            ));
    public List<Country> getAllCountries(){
        List listOfCountries=new ArrayList<Country>();
        countryRepository.findAll().forEach(listOfCountries::add);
        return listOfCountries;
    }

    public Country getCountry(String id) {
        Country country =countryRepository.findById(id).get();
        return country;
    }

    public void addCountry(Country country){
        countryRepository.save(country);
    }

//    public void updateCountry(String id, Country country) {
//        for (int i=0;i<listOfCountries.size();i++){
//            Country c =listOfCountries.get(i);
//            if (c.getId().equals(id))listOfCountries.set(i,country);
//        }
//    }
//
//    public void deleteCountry(String id){
//        listOfCountries.removeIf(country->country.getId().equals(id));
//    }
}
