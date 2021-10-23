package com.example.stockexchangeapi.controllers;

import com.example.stockexchangeapi.models.Country;
import com.example.stockexchangeapi.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {
   @Autowired
    private CountryService countryService;

    @RequestMapping("/countries")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @RequestMapping("/countries/{id}")
    public Country getCountry(@PathVariable String id){
        return countryService.getCountry(id);
    }

    @RequestMapping(method= RequestMethod.POST,value = "/countries")
    public void addCountry(@RequestBody Country country){
        countryService.addCountry(country);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "countries/{id}")
    public void updateCountry(@PathVariable String id,@RequestBody Country country){
        countryService.updateCountry(id,country);
    }
}
