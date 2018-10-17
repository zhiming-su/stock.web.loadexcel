package com.xiyu.stock.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "GONGSI_DAIMA_copy")
@IdClass(PrimaryKeyGongSiDaiMa.class)
public class GongSiDaiMa {

	@Id
	@Column(name = "GONGSI_ID")
	private String GONGSI_ID;
	
	@Id
	@Column(name = "FUXIANG")
	private String FUXIANG;
	
	@Column(name = "GONGSI_MC")
	private String GONGSI_MC;
	
	@Column(name = "PINYIN_JC")
	private String PINYIN_JC;
	
	@Column(name = "JIGOU_LX_1")
	private String JIGOU_LX_1;
	
	@Column(name = "CAIBAO_LX")
	private String CAIBAO_LX;
	
	@Column(name = "MARK_ID")
	private String MARK_ID;
	
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
	public String getGONGSI_MC() {
		return GONGSI_MC;
	}
	public void setGONGSI_MC(String gONGSI_MC) {
		GONGSI_MC = gONGSI_MC;
	}
	public String getPINYIN_JC() {
		return PINYIN_JC;
	}
	public void setPINYIN_JC(String pINYIN_JC) {
		PINYIN_JC = pINYIN_JC;
	}
	public String getJIGOU_LX_1() {
		return JIGOU_LX_1;
	}
	public void setJIGOU_LX_1(String jIGOU_LX_1) {
		JIGOU_LX_1 = jIGOU_LX_1;
	}
	public String getCAIBAO_LX() {
		return CAIBAO_LX;
	}
	public void setCAIBAO_LX(String cAIBAO_LX) {
		CAIBAO_LX = cAIBAO_LX;
	}
	public String getMARK_ID() {
		return MARK_ID;
	}
	public void setMARK_ID(String mARK_ID) {
		MARK_ID = mARK_ID;
	}
	
	
}
