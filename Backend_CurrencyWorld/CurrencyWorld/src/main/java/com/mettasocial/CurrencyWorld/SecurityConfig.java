package com.mettasocial.CurrencyWorld;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@Configuration
public class SecurityConfig {
	
	@Bean
	 public CorsFilter corsFilter() {
     CorsConfiguration config = new CorsConfiguration();
     config.setAllowCredentials(true);
     config.addAllowedOrigin("http://localhost:4200");
     config.addAllowedHeader("*");
     config.addAllowedMethod("*");
     
     
     
     UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
     source.registerCorsConfiguration("/**", config);
     
     return new CorsFilter(source);
 }

   
}

