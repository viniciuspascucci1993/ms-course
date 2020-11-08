package com.vinicius.hrapigatewayzuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * Classe de configuração do api gateway Zuul
 * @author Vinicius-PC
 */
@Configuration
public class AppConfig {

	@Bean
	public JwtAccessTokenConverter jwtAccessTokenConverter() {
		
		JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
		accessTokenConverter.setSigningKey("MY-SECRET-KEY");
		
		return accessTokenConverter;
	}
	
	@Bean
	public JwtTokenStore jwtTokenStore() {
		
		return new JwtTokenStore(jwtAccessTokenConverter());
	}
}
