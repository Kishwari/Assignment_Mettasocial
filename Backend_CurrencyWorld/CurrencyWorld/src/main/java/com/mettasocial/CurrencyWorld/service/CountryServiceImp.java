package com.mettasocial.CurrencyWorld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mettasocial.CurrencyWorld.dto.CountryDTO;
import com.mettasocial.CurrencyWorld.entity.Country;
import com.mettasocial.CurrencyWorld.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class CountryServiceImp implements ICountryService {

	@Autowired
	CountryRepository repository;
	
	@Override
	public Country addCountry(CountryDTO countrydto) {
		Country country=new Country();
		country.setCountryId(countrydto.getCountryId());
		country.setCountryCode(countrydto.getCountryCode());
		country.setCountryCurrency(countrydto.getCountryCurrency());
		country.setCountryName(countrydto.getCountryName());
		country.setCountryCapital(countrydto.getCountryCapital());
		
		return repository.save(country);
	}

	@Override
	public Country updateCountry(CountryDTO countrydto) {
		Country country=new Country();
		country.setCountryId(countrydto.getCountryId());
		country.setCountryCode(countrydto.getCountryCode());
		country.setCountryCurrency(countrydto.getCountryCurrency());
		country.setCountryName(countrydto.getCountryName());
		country.setCountryCapital(countrydto.getCountryCapital());
		
		return repository.save(country);
	}

	@Override
	public Country getCountryByCurrency(String countryCurrency) {
		return repository.findByCountryCurrency(countryCurrency);
	}

	@Override
	public String deleteCountryById(int countryId) {
		repository.deleteById(countryId);
		return "Record deleted";
	}

	@Override
	public List<Country> getAllCountries() {
		return repository.findAll();
	}

	@Override
	public Country getCountryByCode(String countryCode) {
		return repository.findByCountryCode(countryCode);
	}

}
