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

public class MaskDate extends BaseBO<MaskDate> implements Serializable {
	private static final long serialVersionUID = 1L;

	public MaskDate() {
		super();
	}

	public MaskDate(String data) {
		super();
		setData(data);
	}

	private MaskAammddA maskAammddA = new MaskAammddA();

	public MaskAammddA getMaskAammddA() {
		return maskAammddA;

	}

	public void setMaskAammddA(MaskAammddA maskAammddA) {
		this.maskAammddA = maskAammddA;
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 6);
		this.setMaskAammddA(new MaskAammddA(baseData.substring(0, 6)));

	}

	@Override
	public String toString() {
		return getMaskAammddA().toString();
	}

}