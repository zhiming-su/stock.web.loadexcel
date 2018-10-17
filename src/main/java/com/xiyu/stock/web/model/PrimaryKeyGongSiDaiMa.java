package com.xiyu.stock.web.model;

import java.io.Serializable;

public class PrimaryKeyGongSiDaiMa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String GONGSI_ID;
	private String FUXIANG;
	public String getGONGSI_ID() {
		return GONGSI_ID;
	}
	public void setGONGSI_ID(String gONGSI_ID) {
		GONGSI_ID = gONGSI_ID;
	}
	public String getFUXIANG() {
		return FUXIANG;
	}
	public void setFUXIANG(String fUXIANG) {
		FUXIANG = fUXIANG;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
