package com.gauravkabra;

public class CountyTax {

	private double taxRate;
	private String countyName;
	
	public CountyTax(double taxRate, String countyName) {
		this.taxRate = taxRate;
		this.countyName = countyName;
	}
	
	public double getTaxRate() {
		return this.taxRate;
	}
	
	public String getCountyName() {
		return this.countyName;
	}
	
}
