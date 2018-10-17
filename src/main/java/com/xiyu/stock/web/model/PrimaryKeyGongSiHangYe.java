package com.xiyu.stock.web.model;

import java.io.Serializable;


public class PrimaryKeyGongSiHangYe implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ZHENGQUAN_ID;
	private String HANGYE_ID;
	public String getZHENGQUAN_ID() {
		return ZHENGQUAN_ID;
	}
	public void setZHENGQUAN_ID(String zHENGQUAN_ID) {
		ZHENGQUAN_ID = zHENGQUAN_ID;
	}
	public String getHANGYE_ID() {
		return HANGYE_ID;
	}
	public void setHANGYE_ID(String hANGYE_ID) {
		HANGYE_ID = hANGYE_ID;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
