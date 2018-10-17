package com.xiyu.stock.web.model;

import java.io.Serializable;


public class PrimaryKeySecurityCode implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String StockCode;
	private String StockName;
	private String IsValid;
	public String getStockCode() {
		return StockCode;
	}
	public void setStockCode(String stockCode) {
		StockCode = stockCode;
	}
	public String getStockName() {
		return StockName;
	}
	public void setStockName(String stockName) {
		StockName = stockName;
	}
	public String getIsValid() {
		return IsValid;
	}
	public void setIsValid(String isValid) {
		IsValid = isValid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
