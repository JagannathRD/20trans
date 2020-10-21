package com.xworkz.table.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currency_table")
public class CurrencyDTO implements Serializable{

	public CurrencyDTO(){
		System.out.println(this.getClass().getSimpleName() +"created");
	}
	@Id
	@Column(name="currency_id")
	private int id;
	@Column(name="currency_name")
	private String currencyName;
	@Column(name="currency_country")
	private String country;
	@Column(name="exchange_rate")
	private double exchangeRateWRTUSDollar;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getExchangeRateWRTUSDollar() {
		return exchangeRateWRTUSDollar;
	}
	public void setExchangeRateWRTUSDollar(Double exchangeRateWRTUSDollar) {
		this.exchangeRateWRTUSDollar = exchangeRateWRTUSDollar;
	}
	
	
}
