package com.vinicius.hrpayroll.entities;

import java.io.Serializable;

/**
 * Classe de entidade relacionado a Payment.
 * @author Vinicius-PC
 */
public class Payment implements Serializable {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Representa o nome do Payment.
	 */
	private String name;
	
	/**
	 * Representa a quantidade de dias pagas.
	 */
	private Double dailyIncome;
	
	/**
	 * Representa os dias.
	 */
	private Integer days;
	
	/* Construtor padrão */
	public Payment() { }

	/**
	 * Construtor com argumentos.
	 * 
	 * @param name - String - name do Payment.
	 * @param dailyIncome - Double - quantidade de dias para pagamento.
	 * @param days - Integer - dias.
	 */
	public Payment(String name, Double dailyIncome, Integer days) {
		super();
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

	
	/**
	 * Metodo get().
	 * @return name - String - name do payment.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Metodo set().
	 * @param name - String - name do payment.
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Metodo get().
	 * @return dailyIncome - Double - quantidade de dias para pagamento.
	 */
	public Double getDailyIncome() {
		return this.dailyIncome;
	}

	/**
	 * Metodo set().
	 * @param dailyIncome - Double - quantidade de dias para pagamento.
	 */
	public void setDailyIncome(final Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	/**
	 * Metodo get().
	 * @return days - Integer - dias.
	 */
	public Integer getDays() {
		return this.days;
	}

	/**
	 * Metodo set().
	 * @param days - Integer - dias.
	 */
	public void setDays(final Integer days) {
		this.days = days;
	}
	
	/**
	 * getTotal().
	 * @return
	 */
	public double getTotal() {
		return days * dailyIncome;
	}

	@Override
	public String toString() {
		return "Payment "
				+ "[NAME: " + name + ", \n"
				+ "DAILY INCOME: " + dailyIncome + ", \n"
				+ "DAYS: " + days +  "]";
	}
	
	

}
