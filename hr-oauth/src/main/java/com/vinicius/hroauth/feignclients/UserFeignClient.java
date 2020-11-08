package com.vinicius.hroauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vinicius.hroauth.entities.User;

/**
 * Interface responsável por tratar a comunicação do hr-user com hr-oauth através do Feign Clients.
 * @author Vinicius-PC
 */
@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

	@RequestMapping( value = "/search", method = RequestMethod.GET)
	ResponseEntity<User> findByEmail( @RequestParam String email );
}
