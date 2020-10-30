package com.vinicius.hrpayroll.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinicius.hrpayroll.entities.Worker;

/**
 * Interface Worker FeignClien - O feign é uma outra maneira alternativa para comunicação entre serviços
 * @author Vinicius-PC
 */
@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {
	
	@RequestMapping( value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Worker> findById( @PathVariable Long id );

}
