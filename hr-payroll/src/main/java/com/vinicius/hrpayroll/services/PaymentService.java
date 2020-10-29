package com.vinicius.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vinicius.hrpayroll.entities.Payment;
import com.vinicius.hrpayroll.entities.Worker;

/**
 * Classe de service que irá instanciar um objeto Payment.
 * @author Vinicius-PC
 */
@Service
public class PaymentService {
	
	/* Buscando host do arquivo.porperties*/
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment( long workerId, int days ) {
		
		/* Colocando as uris das variaveis*/
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("id", "" + workerId);
		
		/* Fazer requisição a outro service usando RestTemplate*/
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
