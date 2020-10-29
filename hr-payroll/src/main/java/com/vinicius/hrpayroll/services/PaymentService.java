package com.vinicius.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.vinicius.hrpayroll.entities.Payment;

/**
 * Classe de service que irá instanciar um objeto Payment.
 * @author Vinicius-PC
 */
@Service
public class PaymentService {

	public Payment getPayment( long workerId, int days ) {
		return new Payment("Bob", 200.0, days);
	}
}
