package com.vinicius.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.hrpayroll.entities.Payment;
import com.vinicius.hrpayroll.entities.Worker;
import com.vinicius.hrpayroll.feignclient.WorkerFeignClient;

/**
 * Service que será responsável a consulta, acesso a base de dados, utilização de FEIGN,
 * @author Vinicius-PC.
 */
@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment( long workerId, int days ) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody(); 
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
