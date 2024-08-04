package com.circuit.custom_xmlpraser.pojo;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AppHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class AppHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	private CreditInfo crtdInfo;
	private DebitInfo debtInfo;
	public CreditInfo getCrtdInfo() {
		return crtdInfo;
	}
	public void setCrtdInfo(CreditInfo crtdInfo) {
		this.crtdInfo = crtdInfo;
	}
	public DebitInfo getDebtInfo() {
		return debtInfo;
	}
	public void setDebtInfo(DebitInfo debtInfo) {
		this.debtInfo = debtInfo;
	}
	
}