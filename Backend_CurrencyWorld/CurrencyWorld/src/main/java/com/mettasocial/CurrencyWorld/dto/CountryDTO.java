package com.mettasocial.CurrencyWorld.dto;

public class CountryDTO {

	
	private int countryId;
	private String countryCode;
	private String countryCurrency;
	private String countryName;
	private String countryCapital;
	
	
	public CountryDTO() {
		super();
	}


	public CountryDTO(int countryId, String countryCode, String countryCurrency, String countryName,
			String countryCapital) {
		super();
		this.countryId = countryId;
		this.countryCode = countryCode;
		this.countryCurrency = countryCurrency;
		this.countryName = countryName;
		this.countryCapital = countryCapital;
	}


	public int getCountryId() {
		return countryId;
	}


	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public String getCountryCurrency() {
		return countryCurrency;
	}


	public void setCountryCurrency(String countryCurrency) {
		this.countryCurrency = countryCurrency;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String getCountryCapital() {
		return countryCapital;
	}


	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}


	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryCode=" + countryCode + ", countryCurrency="
				+ countryCurrency + ", countryName=" + countryName + ", countryCapital=" + countryCapital + "]";
	}
	
	
	
}

