package com.vinicius.hruser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.hruser.entities.User;
import com.vinicius.hruser.repositories.UserRepository;
/**
 * Classe responsável por ser o resource da aplicação.
 * @author Vinicius-PC
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping( value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> findById( @PathVariable Long id ) {
		
		User worker = userRepository.findById(id).get();
		return ResponseEntity.ok(worker);
	}
	
	@RequestMapping( value = "/search", method = RequestMethod.GET)
	public ResponseEntity<User> findByEmail( @RequestParam String email ) {
		
		User worker = userRepository.findByEmail(email);
		return ResponseEntity.ok(worker);
	}

}
