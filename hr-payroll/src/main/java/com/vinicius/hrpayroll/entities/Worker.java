package com.vinicius.hrpayroll.entities;

import java.io.Serializable;

/**
 * Classe de entidade que será responspável por ser um 'Trabalhador'
 * @author Vinicius-PC - Vinicius Torres Pascucci
 */
public class Worker implements Serializable {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Representa o identificador do Worker.
	 */
	private Long id;
	
	/**
	 * Representa o nome do Worker.
	 */
	private String name;
	
	/**
	 * Representa o quanto o trabalhador ganha por dia.
	 */
	private Double dailyIncome;

	/* Construtor padrão */
	public Worker() { }

	/**
	 * Construtor com argumentos.
	 * 
	 * @param id - Long - identificador Worker.
	 * @param name - String - nome do Worker.
	 * @param dailyIncome - Double - quanto o trabalhador ganha por dia.
	 */
	public Worker(Long id, String name, Double dailyIncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	/**
	 * Metodo get().
	 * @return id - Long - identificador Worker.
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Metodo set().
	 * @param id - Long - identificador Worker.
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Metodo get().
	 * @return name - String - nome do Worker.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Metodo set().
	 * @param name - String - nome do Worker.
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Metodo get().
	 * @return dailyIncome - Double - quanto o trabalhador ganha por dia.
	 */
	public Double getDailyIncome() {
		return this.dailyIncome;
	}

	/**
	 * Metodo set().
	 * @param dailyIncome - Double - quanto o trabalhador ganha por dia.
	 */
	public void setDailyIncome(final Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	/**
	 * Metodo hasCode.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * Metodo equals.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Worker "
				+ "[IDENTIFICADOR: " + id + ", \n"
				+ "NOME: " + name + ", \n"
				+ "DAILY INCOME: " + dailyIncome + "]";
	}
}
