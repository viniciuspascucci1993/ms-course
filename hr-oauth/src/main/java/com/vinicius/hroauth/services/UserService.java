package com.vinicius.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.hroauth.entities.User;
import com.vinicius.hroauth.feignclients.UserFeignClient;

/**
 * Classe responsável por tratar a comunicação entre os micro-services hr-oauth e hr-user
 * @author Vinicius-PC
 */
@Service
public class UserService {
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail( String email ) {
		
		User user = userFeignClient.findByEmail(email).getBody();
		if (user == null) {
			logger.error("E-mail Not Found " + email);
			throw new IllegalArgumentException("E-mail not found");
		}
		logger.info("E-mail found " + email);
		return user;
	}
}
