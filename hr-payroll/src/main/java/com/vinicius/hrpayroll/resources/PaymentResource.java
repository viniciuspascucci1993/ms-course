package com.vinicius.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.hrpayroll.entities.Payment;
import com.vinicius.hrpayroll.services.PaymentService;

/**
 * Resource que serão nossos controladores.
 * @author Vinicius-PC.
 */
@RestController
@RequestMapping( value = "/payments")
public class PaymentResource {

	@Autowired
	private PaymentService service;

	@GetMapping( value = "/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment( @PathVariable Long workerId, @PathVariable Integer days ) {
		Payment payment = service.getPayment(workerId, days);
		
		return ResponseEntity.ok(payment);
	}

}
