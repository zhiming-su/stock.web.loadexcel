package com.xiyu.stock.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "Security_Code_test")
@IdClass(PrimaryKeySecurityCode.class)
public class SecurityCodeNew {
	
	@Id
	@Column(name = "StockCode")
	private String StockCode;
	
	@Id
	@Column(name = "StockName")
	private String StockName;
	
	@Id
	@Column(name = "IsValid")
	private String IsValid;
	
	@Column(name = "PhoneticName")
	private String PhoneticName;
	
	@Column(name = "CompanyCode")
	private String CompanyCode;
	
	@Column(name = "TradingPlaces")
	private String TradingPlaces;
	
	@Column(name = "StockType")
	private String StockType;
	
	@Column(name = "StockTrade")
	private String StockTrade;
	
	@Column(name = "ListingStatus")
	private String ListingStatus;
	
	@Column(name = "Auditmark")
	private String Auditmark;

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

	public String getPhoneticName() {
		return PhoneticName;
	}

	public void setPhoneticName(String phoneticName) {
		PhoneticName = phoneticName;
	}

	public String getCompanyCode() {
		return CompanyCode;
	}

	public void setCompanyCode(String companyCode) {
		CompanyCode = companyCode;
	}

	public String getTradingPlaces() {
		return TradingPlaces;
	}

	public void setTradingPlaces(String tradingPlaces) {
		TradingPlaces = tradingPlaces;
	}

	public String getStockType() {
		return StockType;
	}

	public void setStockType(String stockType) {
		StockType = stockType;
	}

	public String getStockTrade() {
		return StockTrade;
	}

	public void setStockTrade(String stockTrade) {
		StockTrade = stockTrade;
	}

	public String getListingStatus() {
		return ListingStatus;
	}

	public void setListingStatus(String listingStatus) {
		ListingStatus = listingStatus;
	}

	public String getAuditmark() {
		return Auditmark;
	}

	public void setAuditmark(String auditmark) {
		Auditmark = auditmark;
	}

	
}
