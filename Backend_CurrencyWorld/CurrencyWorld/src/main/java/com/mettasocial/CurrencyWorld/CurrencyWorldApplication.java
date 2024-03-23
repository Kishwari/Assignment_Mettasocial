package com.mettasocial.CurrencyWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class CurrencyWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyWorldApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
