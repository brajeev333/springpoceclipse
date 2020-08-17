package com.hcl.demo.dataobject;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

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

public class UtKJSlut extends BaseBO<UtKJSlut> implements Serializable {
	private static final long serialVersionUID = 1L;

	public UtKJSlut() {
		super();
	}

	public UtKJSlut(String data) {
		super();
		setData(data);
	}

	private String fillerUtKJSlut1 = " ";

	private String fillerUtKJSlut2 = "****** VPBV05  K O R L O G G  SLUT ********";

	public String getFillerUtKJSlut1() {
		return fillerUtKJSlut1;

	}

	public void setFillerUtKJSlut1(String fillerUtKJSlut1) {
	}

	public String getFillerUtKJSlut2() {
		return fillerUtKJSlut2;

	}

	public void setFillerUtKJSlut2(String fillerUtKJSlut2) {
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 59);
		this.setFillerUtKJSlut1(baseData.substring(0, 1));
		this.setFillerUtKJSlut2(baseData.substring(1, 59));

	}

	@Override
	public String toString() {
		return StringUtils.rightPad(getFillerUtKJSlut1().toString(), 1) + StringUtils.rightPad(getFillerUtKJSlut2().toString(), 58);
	}

}