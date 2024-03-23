package com.mettasocial.CurrencyWorld.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mettasocial.CurrencyWorld.dto.CountryDTO;
import com.mettasocial.CurrencyWorld.entity.Country;
import com.mettasocial.CurrencyWorld.service.ICountryService;


@RestController
@RequestMapping("restcountries.com/v3.1/")
@CrossOrigin("http://localhost:4200")
public class CountryRestController {

	@Autowired
	ICountryService service;
	
	
	@PostMapping("/add")
	public Country insertCountry(@RequestBody CountryDTO countrydto) {
		return service.addCountry(countrydto);
	}

	@PutMapping("/update")
	public Country updateCountry(@RequestBody CountryDTO countrydto) {
		return service.updateCountry(countrydto);
	}

	@GetMapping("/currency/{countryCurrency}")
	public Country getCountryByCurrency(@PathVariable String countryCurrency)  {
		return service.getCountryByCurrency(countryCurrency);
		
	}

	@DeleteMapping("/delete/{countryId}")
	public String deleteById(@PathVariable int countryId) {
		return service.deleteCountryById(countryId);
	}
	@GetMapping("/code/{countryCode}")
	public Country getCountryByCode(@PathVariable String countryCode)  {
		return service.getCountryByCode(countryCode);
		
	}
	@GetMapping("/getall")
	public List<Country> getAll() {
		return service.getAllCountries();
	}

}
