import { Component } from '@angular/core';
import { Country } from '../../Model/country';
import { CountryService } from '../../Service/country.service';

@Component({
  selector: 'app-country',
  templateUrl: './country.component.html',
  styleUrls: ['./country.component.css']
})
export class CountryComponent {
  countryList: Country[] = [];
  
  searchValue: string = ''; 
  constructor(private countryService: CountryService ){ }


ngOnInit(){
  this.getAllCountries();
}

  getAllCountries(){
       this.countryService.getAll().subscribe(  
           (countries) => {  this.countryList = countries; 
                              console.log(countries);} );
  }

getCountryImage(country: any): string {
  if (country.countryName === 'Andorra') {
      return "https://flagsapi.com/AD/shiny/64.png";   } 
  else if (country.countryName === 'United Arab Emirates') {
    return "https://flagsapi.com/AE/shiny/64.png"; }
  else if (country.countryName === 'Afghanistan') {
      return "https://flagsapi.com/AF/shiny/64.png"; }
    
  else if (country.countryName === 'Antigua and Barbuda') {
       return "https://flagsapi.com/AG/shiny/64.png"; }
  else if (country.countryName === 'Armenia') {
       return "https://flagsapi.com/AM/shiny/64.png"; }

   else if (country.countryName === 'Australia') {
      return "https://flagsapi.com/AU/shiny/64.png"; }
  else if (country.countryName === 'Azerbaijan') {
      return "https://flagsapi.com/AZ/shiny/64.png"; }

   else if (country.countryName === 'Bahrain') {
        return "https://flagsapi.com/BH/shiny/64.png"; }
    else if (country.countryName === 'Bangladesh') {
       return "https://flagsapi.com/BD/shiny/64.png"; }
    else if (country.countryName === 'Belgium') {
         return "https://flagsapi.com/BE/shiny/64.png"; }
     else if (country.countryName === 'Belize') {
           return "https://flagsapi.com/BZ/shiny/64.png"; }

     else if (country.countryName === 'Benin') {
           return "https://flagsapi.com/BJ/shiny/64.png"; }
     else if (country.countryName === 'Bhutan') {
            return "https://flagsapi.com/BT/shiny/64.png"; }

     else if (country.countryName === 'Botswana') {
          return "https://flagsapi.com/BW/shiny/64.png"; }
      else if (country.countryName === 'Brazil') {
         return "https://flagsapi.com/BR/shiny/64.png"; }

     else if (country.countryName === 'Bulgaria') {
         return "https://flagsapi.com/BG/shiny/64.png"; }
      else if (country.countryName === 'Chile') {
         return "https://flagsapi.com/CL/shiny/64.png"; }

      else if (country.countryName === 'Canada') {
         return "https://flagsapi.com/CA/shiny/64.png"; }
    else if (country.countryName === 'China') {
          return "https://flagsapi.com/CN/shiny/64.png"; }

  else if (country.countryName === 'Colombia') {
          return "https://flagsapi.com/CO/shiny/64.png"; }
      else if (country.countryName === 'Cuba') {
         return "https://flagsapi.com/CU/shiny/64.png"; }
                    
      else if (country.countryName === 'Denmark') {
          return "https://flagsapi.com/DK/shiny/64.png"; }
    else if (country.countryName === 'Dominica') {
          return "https://flagsapi.com/DM/shiny/64.png"; }
                    
      else if (country.countryName === 'Ecuador') {
           return "https://flagsapi.com/EC/shiny/64.png"; }
      else if (country.countryName === 'Egypt') {
            return "https://flagsapi.com/EG/shiny/64.png"; }
                    
       else if (country.countryName === 'Germany') {
         return "https://flagsapi.com/DE/shiny/64.png"; }
        else if (country.countryName === 'Greece') {
            return "https://flagsapi.com/GR/shiny/64.png"; }
                    
         else if (country.countryName === 'India') {
                 return "https://flagsapi.com/IN/shiny/64.png"; }
      else if (country.countryName === 'Italy') {
           return "https://flagsapi.com/IT/shiny/64.png"; }
       else if (country.countryName === 'South Africa') {
               return "https://flagsapi.com/ZA/shiny/64.png"; }
                                                          
      
     return "../assets/flag.jpg"; // Default image path if no specific image found
  
 }
 
}
