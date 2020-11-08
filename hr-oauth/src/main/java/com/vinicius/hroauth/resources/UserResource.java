package com.vinicius.hroauth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.hroauth.entities.User;
import com.vinicius.hroauth.services.UserService;

/**
 * Classe responsável por ser o resource da aplicação.
 * @author Vinicius-PC
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	@RequestMapping( value = "/search", method = RequestMethod.GET)
	public ResponseEntity<User> findByEmail( @RequestParam String email ) {
		
		try {
			User user = userService.findByEmail(email);
			return ResponseEntity.ok(user);	
			
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
}
