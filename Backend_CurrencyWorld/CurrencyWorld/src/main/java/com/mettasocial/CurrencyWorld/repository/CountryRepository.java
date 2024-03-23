package com.mettasocial.CurrencyWorld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mettasocial.CurrencyWorld.entity.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country,Integer>{

	Country findByCountryCurrency(String countryCurrency);
    Country findByCountryCode(String countryCode);
    
}
