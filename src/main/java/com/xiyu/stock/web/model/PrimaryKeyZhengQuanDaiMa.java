package com.xiyu.stock.web.model;

import java.io.Serializable;


public class PrimaryKeyZhengQuanDaiMa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ZHENGQUAN_ID;
	private String ZHENGQUAN_JC;
	private String IsValid;
	public String getZHENGQUAN_ID() {
		return ZHENGQUAN_ID;
	}
	public void setZHENGQUAN_ID(String zHENGQUAN_ID) {
		ZHENGQUAN_ID = zHENGQUAN_ID;
	}
	public String getZHENGQUAN_JC() {
		return ZHENGQUAN_JC;
	}
	public void setZHENGQUAN_JC(String zHENGQUAN_JC) {
		ZHENGQUAN_JC = zHENGQUAN_JC;
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
