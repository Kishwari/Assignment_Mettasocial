package com.mettasocial.CurrencyWorld.service;

import java.util.List;
import com.mettasocial.CurrencyWorld.dto.CountryDTO;
import com.mettasocial.CurrencyWorld.entity.Country;



public interface ICountryService {


	public Country addCountry(CountryDTO countrydto);
	 
	public Country updateCountry(CountryDTO countrydto);
 
	public Country  getCountryByCurrency( String countryCurrency) ;
 
	public  String deleteCountryById(int countryId) ;
	
	public  List<Country>  getAllCountries();
	
	public Country getCountryByCode( String countryCode) ;
	
	
}
