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

public class KorAammddA extends BaseBO<KorAammddA> implements Serializable {
	private static final long serialVersionUID = 1L;

	public KorAammddA() {
		super();
	}

	public KorAammddA(String data) {
		super();
		setData(data);
	}

	private KorAammA korAammA = new KorAammA();

	public KorAammA getKorAammA() {
		return korAammA;

	}

	public void setKorAammA(KorAammA korAammA) {
		this.korAammA = korAammA;
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 6);
		this.setKorAammA(new KorAammA(baseData.substring(0, 6)));

	}

	@Override
	public String toString() {
		return getKorAammA().toString();
	}

}