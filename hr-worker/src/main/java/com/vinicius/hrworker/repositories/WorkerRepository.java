package com.vinicius.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.hrworker.entities.Worker;

/**
 * responsável por fazer o acesso ao banco de dados.
 * @author Vinicius-PC - Vinicius Torres Pascucci.
 */ 
public interface WorkerRepository extends JpaRepository<Worker, Long> { }
