package com.circuit.custom_xmlpraser.pojo;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AppHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class AppHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	private String crtdInfo;
	private String debtInfo;

	public String getCrtdInfo() {
		return crtdInfo;
	}

	public void setCrtdInfo(String crtdInfo) {
		this.crtdInfo = crtdInfo;
	}

	public String getDebtInfo() {
		return debtInfo;
	}

	public void setDebtInfo(String debtInfo) {
		this.debtInfo = debtInfo;
	}

}