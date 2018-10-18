package com.xiyu.stock.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "INFO_GONGSI_HANGYE",catalog="ZhiNengShenHe")
@IdClass(PrimaryKeyGongSiHangYe.class)
public class InfoGongSiHangYe {
	
	@Id
	@Column(name = "ZHENGQUAN_ID")
	private String ZHENGQUAN_ID;
	
	@Id
	@Column(name = "HANGYE_ID")
	private String HANGYE_ID;

	@Column(name = "HANGYE_WM")
	private String HANGYE_WM;

	@Column(name = "HANGYE_MC")
	private String HANGYE_MC;

	@Column(name = "GONGSI_ID")
	private String GONGSI_ID;

	@Column(name = "LEIBIE_DM")
	private String LEIBIE_DM;

	@Column(name = "LEIBIE_MC")
	private String LEIBIE_MC;

	@Column(name = "JB")
	private String JB;

	@Column(name = "JIARU_RI")
	private String JIARU_RI;

	@Column(name = "MARK_ID")
	private String MARK_ID;
	
	
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
	public String getHANGYE_WM() {
		return HANGYE_WM;
	}
	public void setHANGYE_WM(String hANGYE_WM) {
		HANGYE_WM = hANGYE_WM;
	}
	public String getHANGYE_MC() {
		return HANGYE_MC;
	}
	public void setHANGYE_MC(String hANGYE_MC) {
		HANGYE_MC = hANGYE_MC;
	}
	public String getGONGSI_ID() {
		return GONGSI_ID;
	}
	public void setGONGSI_ID(String gONGSI_ID) {
		GONGSI_ID = gONGSI_ID;
	}
	public String getLEIBIE_DM() {
		return LEIBIE_DM;
	}
	public void setLEIBIE_DM(String lEIBIE_DM) {
		LEIBIE_DM = lEIBIE_DM;
	}
	public String getLEIBIE_MC() {
		return LEIBIE_MC;
	}
	public void setLEIBIE_MC(String lEIBIE_MC) {
		LEIBIE_MC = lEIBIE_MC;
	}
	public String getJB() {
		return JB;
	}
	public void setJB(String jB) {
		JB = jB;
	}
	public String getJIARU_RI() {
		return JIARU_RI;
	}
	public void setJIARU_RI(String jIARU_RI) {
		JIARU_RI = jIARU_RI;
	}
	public String getMARK_ID() {
		return MARK_ID;
	}
	public void setMARK_ID(String mARK_ID) {
		MARK_ID = mARK_ID;
	}
	
}
