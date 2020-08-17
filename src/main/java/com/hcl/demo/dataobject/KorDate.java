package com.hcl.demo.dataobject;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.hcl.demo.util.DemoUtils;

/**
 * **********************************************************************
 *
 *  HCL CONFIDENTIAL
 *  _________________________________________________________________________________
 *
 *  HCL is a trademark of HCL Company.
 *
 *  Copyright © 2020 HCL. All rights reserved.
 *
 *  NOTICE: All information contained herein is, and remains the property of HCL
 *  and its suppliers, if any. The intellectual and technical concepts contained
 *  herein are proprietary to HCL and its suppliers and may be covered by U.S.
 *  and Foreign Patents, patents in process, and are protected by trade secret or
 *  copyright law. Dissemination of this information or reproduction of this
 *  material is strictly forbidden unless prior written permission is obtained
 *  from HCL.
 *
 * ***********************************************************************
 */
// Author : Generated by ATMA ®
// Revision History :
public class KorDate extends BaseBO<KorDate> implements Serializable {

	private static final long serialVersionUID = 1L;

	public KorDate() {
		super();
	}

	public KorDate(String data) {
		super();
		setData(data);
	}

	private KorAammddA korAammddA = new KorAammddA();

	private FillerKorAammA1 fillerKorAammA1 = new FillerKorAammA1();

	private FillerKorDate1 fillerKorDate1 = new FillerKorDate1();

	private FillerFillerKorDate11 fillerFillerKorDate11 = new FillerFillerKorDate11();

	public KorAammddA getKorAammddA() {
		return korAammddA;
	}

	public void setKorAammddA(KorAammddA korAammddA) {
		this.korAammddA = korAammddA;
	}

	public FillerKorAammA1 getFillerKorAammA1() {
		return fillerKorAammA1;
	}

	public void setFillerKorAammA1(FillerKorAammA1 fillerKorAammA1) {
		this.setData(fillerKorAammA1.toString());
	}

	public FillerKorDate1 getFillerKorDate1() {
		return fillerKorDate1;
	}

	public void setFillerKorDate1(FillerKorDate1 fillerKorDate1) {
		this.setData(fillerKorDate1.toString());
	}

	public FillerFillerKorDate11 getFillerFillerKorDate11() {
		return fillerFillerKorDate11;
	}

	public void setFillerFillerKorDate11(FillerFillerKorDate11 fillerFillerKorDate11) {
		this.setData(fillerFillerKorDate11.toString());
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 6);
		this.setKorAammddA(new KorAammddA(baseData.substring(0, 6)));
	}

	@Override
	public String toString() {
		return getKorAammddA().toString();
	}

	public class FillerFillerKorDate11 extends BaseBO<FillerFillerKorDate11> {

		public Integer getKorAammdd() {
			String baseData = getKorAammddA().toString();
			return DemoUtils.parseToInt(baseData.substring(0, 6));
		}

		public void setKorAammdd(Integer korAammdd) {
			String baseData = getKorAammddA().toString();
			baseData = StringUtils.rightPad(baseData, 6);
			baseData = StringUtils.overlay(baseData, korAammdd.toString(), 0, 6);
			getKorAammddA().setData(baseData);
		}

		public void setData(String baseData) {
			baseData = StringUtils.rightPad(baseData, 6);
		}

		@Override
		public String toString() {
			return getKorAammddA().toString();
		}
	}

	public class FillerKorDate1 extends BaseBO<FillerKorDate1> {

		public String getFillerKorDate2() {
			String baseData = getKorAammddA().toString();
			return baseData.substring(0, 2);
		}

		public void setFillerKorDate2(String fillerKorDate2) {
			String baseData = getKorAammddA().toString();
			baseData = StringUtils.rightPad(baseData, 6);
			baseData = StringUtils.overlay(baseData, fillerKorDate2.toString(), 0, 2);
			getKorAammddA().setData(baseData);
		}

		public KorMmddA getKorMmddA() {
			String baseData = getKorAammddA().toString();
			return new KorMmddA(baseData.substring(2, 6));
		}

		public void setKorMmddA(KorMmddA korMmddA) {
			String baseData = getKorAammddA().toString();
			baseData = StringUtils.rightPad(baseData, 6);
			baseData = StringUtils.overlay(baseData, korMmddA.toString(), 2, 6);
			getKorAammddA().setData(baseData);
		}

		public void setData(String baseData) {
			baseData = StringUtils.rightPad(baseData, 6);
		}

		@Override
		public String toString() {
			return getKorAammddA().toString();
		}
	}

	public class FillerKorAammA1 extends BaseBO<FillerKorAammA1> {

		public Integer getKorAamm() {
			String baseData = getKorAammddA().toString();
			return DemoUtils.parseToInt(baseData.substring(0, 4));
		}

		public void setKorAamm(Integer korAamm) {
			String baseData = getKorAammddA().toString();
			baseData = StringUtils.rightPad(baseData, 6);
			baseData = StringUtils.overlay(baseData, korAamm.toString(), 0, 4);
			getKorAammddA().setData(baseData);
		}

		public String getFillerFillerKorAammA11() {
			String baseData = getKorAammddA().toString();
			return baseData.substring(4, 6);
		}

		public void setFillerFillerKorAammA11(String fillerFillerKorAammA11) {
			String baseData = getKorAammddA().toString();
			baseData = StringUtils.rightPad(baseData, 6);
			baseData = StringUtils.overlay(baseData, fillerFillerKorAammA11.toString(), 4, 6);
			getKorAammddA().setData(baseData);
		}

		public void setData(String baseData) {
			baseData = StringUtils.rightPad(baseData, 6);
		}

		@Override
		public String toString() {
			return getKorAammddA().toString();
		}
	}
}