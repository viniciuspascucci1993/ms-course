package com.vinicius.hrapigatewayzuul.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * Classe de configuração do api gateway Zuul
 * @author Vinicius-PC
 */
@RefreshScope
@Configuration
public class AppConfig {
	
	@Value("${jwt.secret}")
	private String jwtSecret;

	@Bean
	public JwtAccessTokenConverter jwtAccessTokenConverter() {
		
		JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
		accessTokenConverter.setSigningKey(jwtSecret);
		
		return accessTokenConverter;
	}
	
	@Bean
	public JwtTokenStore jwtTokenStore() {
		
		return new JwtTokenStore(jwtAccessTokenConverter());
	}
}
