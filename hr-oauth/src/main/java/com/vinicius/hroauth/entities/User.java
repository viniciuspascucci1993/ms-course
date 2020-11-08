package com.vinicius.hroauth.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Classe responsável por conter os atributos de um user para obtenção de suas credenciais de autorização.
 * @author Vinicius-PC
 */
public class User implements UserDetails, Serializable {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Representa o identificador do usuario.
	 */
	private Long id;
	
	/**
	 * Representa o nome do usuario.
	 */
	private String name;
	
	/**
	 * Representa o email do usuario ( Login ).
	 */
	private String email;
	
	/**
	 * Representa a senha do usuario.
	 */
	private String password;
	
	/**
	 * Representa um conjunto de roles.
	 */
	private Set<Role> roles = new HashSet<Role>();
	
	/* Construtor padrão */
	public User() { }

	/**
	 * Construtor com argumentos.
	 * 
	 * @param id - Long - Identificador do usuario.
	 * @param name - String - nome do usuario.
	 * @param email - String - email do usuario.
	 * @param password - String - senha do usuario.
	 */
	public User(Long id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	/**
	 * Metodo get().
	 * @return id - Long - identificador do usuario.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Metodo set().
	 * @param id - Long - identificador do usuario.
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Metodo get().
	 * @return name - String - nome do usuario.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Metodo set().
	 * @param name - String - nome do usuario.
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Metodo get().
	 * @return email - String - email do usuario ( Login ).
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Metodo set().
	 * @param email - String - email do usuario ( Login ).
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * Metodo get().
	 * @return password - String - senha do usuario.
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Metodo set().
	 * @param password - String - senha do usuario.
	 */
	public void setPassword(final String password) {
		this.password = password;
	}
	
	/**
	 * Metodo get()
	 * @return roles - Set<Role> - conjunto de roles do usuario.
	 */
	public Set<Role> getRoles() {
		return this.roles;
	}

	/**
	 * Metodo hasCode().
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * Metodo equals().
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User "
				+ "[IDENTIFICADOR: " + id + ", \n"
				+ "NOME DO USUARIO: " + name + ", \n"
				+ "E-MAIL DO USUARIO: " + email + ", \n"
				+ "SENHA DO USUARIO: " + password + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return roles.stream()
				.map(x -> new SimpleGrantedAuthority(x.getRoleName()))
				.collect(Collectors.toList());
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
