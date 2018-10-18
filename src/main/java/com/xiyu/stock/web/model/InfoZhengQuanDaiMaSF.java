package com.xiyu.stock.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "INFO_ZHENGQUAN_DAIMA",catalog="ZhiNengShenHe")
@IdClass(PrimaryKeyZhengQuanDaiMa.class)
public class InfoZhengQuanDaiMaSF {

	@Id
	@Column(name = "ZHENGQUAN_ID")
	private String ZHENGQUAN_ID;

	@Id
	@Column(name = "ZHENGQUAN_JC")
	private String ZHENGQUAN_JC;

	@Id
	@Column(name = "IsValid")
	private String IsValid;

	@Column(name = "PINYIN_JC")
	private String PINYIN_JC;

	@Column(name = "GONGSI_ID")
	private String GONGSI_ID;

	@Column(name = "JIAOYI_DD")
	private String JIAOYI_DD;

	@Column(name = "ZHENGQUAN_LX")
	private String ZHENGQUAN_LX;

	@Column(name = "JIAOYI_ID")
	private String JIAOYI_ID;

	@Column(name = "SHANGSHI_ZT")
	private String SHANGSHI_ZT;

	@Column(name = "MARK_ID")
	private String MARK_ID;

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

	public String getPINYIN_JC() {
		return PINYIN_JC;
	}

	public void setPINYIN_JC(String pINYIN_JC) {
		PINYIN_JC = pINYIN_JC;
	}

	public String getGONGSI_ID() {
		return GONGSI_ID;
	}

	public void setGONGSI_ID(String gONGSI_ID) {
		GONGSI_ID = gONGSI_ID;
	}

	public String getJIAOYI_DD() {
		return JIAOYI_DD;
	}

	public void setJIAOYI_DD(String jIAOYI_DD) {
		JIAOYI_DD = jIAOYI_DD;
	}

	public String getZHENGQUAN_LX() {
		return ZHENGQUAN_LX;
	}

	public void setZHENGQUAN_LX(String zHENGQUAN_LX) {
		ZHENGQUAN_LX = zHENGQUAN_LX;
	}

	public String getJIAOYI_ID() {
		return JIAOYI_ID;
	}

	public void setJIAOYI_ID(String jIAOYI_ID) {
		JIAOYI_ID = jIAOYI_ID;
	}

	public String getSHANGSHI_ZT() {
		return SHANGSHI_ZT;
	}

	public void setSHANGSHI_ZT(String sHANGSHI_ZT) {
		SHANGSHI_ZT = sHANGSHI_ZT;
	}

	public String getMARK_ID() {
		return MARK_ID;
	}

	public void setMARK_ID(String mARK_ID) {
		MARK_ID = mARK_ID;
	}

}
