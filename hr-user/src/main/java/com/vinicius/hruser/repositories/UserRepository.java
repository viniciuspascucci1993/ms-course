package com.vinicius.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.hruser.entities.User;

/**
 * Interface responsavel por contar uma extensão do JpaRepository que contem o CRUD.
 * @author Vinicius-PC
 */
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail( String email );

}
