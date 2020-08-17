package com.hcl.demo.dataobject;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.hcl.demo.util.DemoUtils;

/*************************************************************************
 * 
 * HCL CONFIDENTIAL
 * _________________________________________________________________________________
 * 
 * HCL is a trademark of HCL Company.
 *
 * Copyright © 2020 HCL. All rights reserved.
 * 
 * NOTICE: All information contained herein is, and remains the property of HCL
 * and its suppliers, if any. The intellectual and technical concepts contained
 * herein are proprietary to HCL and its suppliers and may be covered by U.S.
 * and Foreign Patents, patents in process, and are protected by trade secret or
 * copyright law. Dissemination of this information or reproduction of this
 * material is strictly forbidden unless prior written permission is obtained
 * from HCL.
 *
 *************************************************************************/
// Author : Generated by ATMA ®
// Revision History : 

public class BnewdateKortY extends BaseBO<BnewdateKortY> implements Serializable {
	private static final long serialVersionUID = 1L;

	public BnewdateKortY() {
		super();
	}

	public BnewdateKortY(String data) {
		super();
	if(data.trim().length()>0 && null!=data) {
		setData(data);
	}
	}

	private Integer newdSs;

	private BnewdateKort bnewdateKort = new BnewdateKort();

	private String fillerBnewdateKort1;

	public Integer getNewdSs() {
		return newdSs;

	}

	public void setNewdSs(Integer newdSs) {
		this.newdSs = newdSs;
	}

	public BnewdateKort getBnewdateKort() {
		return bnewdateKort;

	}

	public void setBnewdateKort(BnewdateKort bnewdateKort) {
		this.bnewdateKort = bnewdateKort;
	}

	public String getFillerBnewdateKort1() {
		return fillerBnewdateKort1;

	}

	public void setFillerBnewdateKort1(String fillerBnewdateKort1) {
		this.fillerBnewdateKort1 = fillerBnewdateKort1;
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 78);
		this.setNewdSs((Integer) DemoUtils.readFieldAsNumber(baseData.substring(0, 2), "##", Integer.class));
		this.setBnewdateKort(new BnewdateKort(baseData.substring(2, 8)));
		this.setFillerBnewdateKort1(baseData.substring(6, 78));

	}

	@Override
	public String toString() {
		return StringUtils.rightPad(getNewdSs().toString(), 2) + getBnewdateKort().toString() + StringUtils.rightPad(getFillerBnewdateKort1().toString(), 72);
	}

}