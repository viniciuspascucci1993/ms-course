package com.vinicius.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.hrworker.entities.Worker;
import com.vinicius.hrworker.repositories.WorkerRepository;

/**
 * Responsável por conter os nossos endPoints.
 * @author Vinicius-PC - Vinicius Torres Pascucci.
 */
@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Autowired
	private WorkerRepository workerRepository;
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<List<Worker>> findAll() {
		
		List<Worker> lista = workerRepository.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@RequestMapping( value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Worker> findById( @PathVariable Long id ) {
		
		Worker worker = workerRepository.findById(id).get();
		return ResponseEntity.ok(worker);
	}
}
