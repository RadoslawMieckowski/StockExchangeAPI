package com.example.stockexchangeapi.controllers;

import com.example.stockexchangeapi.models.Country;
import com.example.stockexchangeapi.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
   @Autowired
    private CountryService countryService;

    @RequestMapping("/countries")
    public List<Country> getAllCompanies(){
        return countryService.getAllCountries();
    }
}
