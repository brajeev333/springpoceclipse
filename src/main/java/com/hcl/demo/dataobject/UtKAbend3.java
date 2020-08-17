package com.hcl.demo.dataobject;

import java.io.Serializable;
import java.math.BigInteger;

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

public class UtKAbend3 extends BaseBO<UtKAbend3> implements Serializable {
	private static final long serialVersionUID = 1L;

	public UtKAbend3() {
		super();
	}

	public UtKAbend3(String data) {
		super();
		setData(data);
	}

	private String fillerUtKAbend31 = " ";

	private String fillerUtKAbend32 = "SQLKOD: ";

	private BigInteger utKASqlkod;

	private String fillerUtKAbend33 = " ";

	public String getFillerUtKAbend31() {
		return fillerUtKAbend31;

	}

	public void setFillerUtKAbend31(String fillerUtKAbend31) {
	}

	public String getFillerUtKAbend32() {
		return fillerUtKAbend32;

	}

	public void setFillerUtKAbend32(String fillerUtKAbend32) {
	}

	public BigInteger getUtKASqlkod() {
		return utKASqlkod;

	}

	public void setUtKASqlkod(BigInteger utKASqlkod) {
		this.utKASqlkod = utKASqlkod;
	}

	public String getFillerUtKAbend33() {
		return fillerUtKAbend33;

	}

	public void setFillerUtKAbend33(String fillerUtKAbend33) {
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 64);
		this.setFillerUtKAbend31(baseData.substring(0, 1));
		this.setFillerUtKAbend32(baseData.substring(1, 9));
		this.setUtKASqlkod((BigInteger) DemoUtils.readFieldAsNumber(baseData.substring(9, 18), "#########", BigInteger.class));
		this.setFillerUtKAbend33(baseData.substring(18, 64));

	}

	@Override
	public String toString() {
		return StringUtils.rightPad(getFillerUtKAbend31().toString(), 1) + StringUtils.rightPad(getFillerUtKAbend32().toString(), 8) + StringUtils.rightPad(getUtKASqlkod().toString(), 9) + StringUtils.rightPad(getFillerUtKAbend33().toString(), 46);
	}

}