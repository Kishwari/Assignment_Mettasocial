import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Country } from '../Model/country';


@Injectable({
  providedIn: 'root'
})
export class CountryService {


  constructor(private http: HttpClient) { }

  baseUrl = 'http://localhost:8080/restcountries.com/v3.1/';


  getAll(): Observable<Country[]> {

    return this.http.get<Country[]>(this.baseUrl+`getall`);

  }

  getCountryByCurrency(countryCurrency: string) {

   return  this.http.get<Country>(this.baseUrl+`currency/${countryCurrency}`);

  }

  getCountryByCode(countryCode: string) {

    return  this.http.get<Country>(this.baseUrl+`code/${countryCode}`);
 
   }

}
