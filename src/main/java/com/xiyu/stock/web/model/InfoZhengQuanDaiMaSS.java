package com.xiyu.stock.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "INFO_ZHENGQUAN_DAIMA",catalog="ZhiNengShenHe")
@IdClass(PrimaryKeyZhengQuanDaiMa.class)
public class InfoZhengQuanDaiMaSS {

	@Id
	@Column(name = "ZHENGQUAN_ID")
	private String ZHENGQUAN_ID;

	@Id
	@Column(name = "ZHENGQUAN_JC")
	private String ZHENGQUAN_JC;

	@Id
	@Column(name = "IsValid")
	private String IsValid;

	@Column(name = "SHANGSHI_RI")
	private String SHANGSHI_RI;

	@Column(name = "TUISHI_RI" )
	private String TUISHI_RI;

	@Column(name = "ZHUANRANG_FS")
	private String ZHUANRANG_FS;

	@Column(name = "FENCENG_ZT")
	private String FENCENG_ZT;

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

	public String getSHANGSHI_RI() {
		return SHANGSHI_RI;
	}

	public void setSHANGSHI_RI(String sHANGSHI_RI) {
		SHANGSHI_RI = sHANGSHI_RI;
	}

	public String getTUISHI_RI() {
		return TUISHI_RI;
	}

	public void setTUISHI_RI(String tUISHI_RI) {
		TUISHI_RI = tUISHI_RI;
	}

	public String getZHUANRANG_FS() {
		return ZHUANRANG_FS;
	}

	public void setZHUANRANG_FS(String zHUANRANG_FS) {
		ZHUANRANG_FS = zHUANRANG_FS;
	}

	public String getFENCENG_ZT() {
		return FENCENG_ZT;
	}

	public void setFENCENG_ZT(String fENCENG_ZT) {
		FENCENG_ZT = fENCENG_ZT;
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
