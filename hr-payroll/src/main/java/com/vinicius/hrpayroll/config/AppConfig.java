package com.vinicius.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Classe de configuração da aplicação.
 * @author Vinicius-PC
 */
@Configuration
public class AppConfig {

	/**
	 * Implementado o padrão de projeto Singleton para ter a disposição um objeto restTemplate para injetar em outros serviços.
	 * @return RestTemplate();
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
