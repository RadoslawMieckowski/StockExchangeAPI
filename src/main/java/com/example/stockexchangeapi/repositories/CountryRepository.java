package com.example.stockexchangeapi.repositories;

import com.example.stockexchangeapi.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country,String> {
}
