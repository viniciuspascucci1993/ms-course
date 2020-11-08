package com.vinicius.hruser.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe responsável por conter os atributos de roles dos usuarios.
 * @author Vinicius-PC
 */
@Entity
@Table(name = "tb_role")
public class Role implements Serializable {
	
	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Representa o identificador da Role do usuario.
	 */
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * Representa o nome da role do usuario.
	 */
	private String roleName;
	
	/* Construtor padrão */
	public Role() { }

	/**
	 * Construtor com argumentos.
	 * 
	 * @param id - Long - Identificador da role do usuario.
	 * @param roleName - String - nome da role do usuario.
	 */
	public Role(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}

	/**
	 * Metodo get().
	 * @return id - Long - identificador da role do usuario.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Metodo set().
	 * @param id - Long - identificador da role do usuario.
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Metodo get().
	 * @return roleName - String - nome da role do usuario.
	 */
	public String getRoleName() {
		return this.roleName;
	}

	/**
	 * Metodo set().
	 * @param roleName - String - nome da role do usuario.
	 */
	public void setRoleName(final String roleName) {
		this.roleName = roleName;
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
		Role other = (Role) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Role "
				+ "[IDENTIFICADOR DA ROLE: " + id + ", "
				+ "NOME DA ROLE: " + roleName + "]";
	}

}
