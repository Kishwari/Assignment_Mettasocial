import { Pipe, PipeTransform } from '@angular/core';
import { Country } from '../Model/country';

@Pipe({
  name: 'searchBy'
})
export class SearchByPipe implements PipeTransform {

  
 /* transform(countries: any[], currency: string): Country[] {
    if (!currency) return countries; // If no currency is provided, return all countries

    return countries.filter(country => country.countryCurrency === currency);
  }
 */
  transform(countries: any[], searchValue: string): Country[] {
    if (!searchValue) return countries; // If no currency is provided, return all countries

    return countries.filter(country => country.countryCurrency === searchValue || country.countryCode === searchValue);
  }
  

}



