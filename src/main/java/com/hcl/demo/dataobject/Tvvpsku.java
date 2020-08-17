package com.hcl.demo.dataobject;

import java.io.Serializable;
import java.math.BigDecimal;
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

public class Tvvpsku extends BaseBO<Tvvpsku> implements Serializable {
	private static final long serialVersionUID = 1L;

	public Tvvpsku() {
		super();
	}

	public Tvvpsku(String data) {
		super();
		setData(data);
	}

	private BigInteger vv2Pnr;

	private String vv2Kundid;

	private Integer vv2Gruppid;

	private Integer vv2BerDat;

	private String vv2Berkod;

	private String vv2Lkod;

	private Integer vv2Myndk;

	private String vv2Kategori;

	private Integer vv2Forml;

	private String vv2Fslag;

	private Integer vv2Debkod;

	private String vv2Ftekngr;

	private String vv2Ursprung;

	private Integer vv2Fromdatum;

	private Integer vv2Upphalder;

	private Integer vv2Upphdat;

	private Integer vv2Upphkod;

	private Integer vv2PaAntm;

	private BigDecimal vv2Tjtfakt;

	private BigDecimal vv2Upprfakt;

	private Integer vv2Belopp;

	private Integer vv2Itt;

	private Integer vv2Mtt;

	private String vv2Schablon;

	private Integer vv2Punderl;

	private Integer vv2Pskuld;

	private Integer vv2Punderlar;

	private String vv2Kbidr;

	private String vv2Felsts;

	private BigInteger vv2APnr;

	private Integer vv2PskuldSti;

	private BigDecimal vv2Kapfakt;

	private Integer vv2Retro;

	public BigInteger getVv2Pnr() {
		return vv2Pnr;

	}

	public void setVv2Pnr(BigInteger vv2Pnr) {
		this.vv2Pnr = vv2Pnr;
	}

	public String getVv2Kundid() {
		return vv2Kundid;

	}

	public void setVv2Kundid(String vv2Kundid) {
		this.vv2Kundid = vv2Kundid;
	}

	public Integer getVv2Gruppid() {
		return vv2Gruppid;

	}

	public void setVv2Gruppid(Integer vv2Gruppid) {
		this.vv2Gruppid = vv2Gruppid;
	}

	public Integer getVv2BerDat() {
		return vv2BerDat;

	}

	public void setVv2BerDat(Integer vv2BerDat) {
		this.vv2BerDat = vv2BerDat;
	}

	public String getVv2Berkod() {
		return vv2Berkod;

	}

	public void setVv2Berkod(String vv2Berkod) {
		this.vv2Berkod = vv2Berkod;
	}

	public String getVv2Lkod() {
		return vv2Lkod;

	}

	public void setVv2Lkod(String vv2Lkod) {
		this.vv2Lkod = vv2Lkod;
	}

	public Integer getVv2Myndk() {
		return vv2Myndk;

	}

	public void setVv2Myndk(Integer vv2Myndk) {
		this.vv2Myndk = vv2Myndk;
	}

	public String getVv2Kategori() {
		return vv2Kategori;

	}

	public void setVv2Kategori(String vv2Kategori) {
		this.vv2Kategori = vv2Kategori;
	}

	public Integer getVv2Forml() {
		return vv2Forml;

	}

	public void setVv2Forml(Integer vv2Forml) {
		this.vv2Forml = vv2Forml;
	}

	public String getVv2Fslag() {
		return vv2Fslag;

	}

	public void setVv2Fslag(String vv2Fslag) {
		this.vv2Fslag = vv2Fslag;
	}

	public Integer getVv2Debkod() {
		return vv2Debkod;

	}

	public void setVv2Debkod(Integer vv2Debkod) {
		this.vv2Debkod = vv2Debkod;
	}

	public String getVv2Ftekngr() {
		return vv2Ftekngr;

	}

	public void setVv2Ftekngr(String vv2Ftekngr) {
		this.vv2Ftekngr = vv2Ftekngr;
	}

	public String getVv2Ursprung() {
		return vv2Ursprung;

	}

	public void setVv2Ursprung(String vv2Ursprung) {
		this.vv2Ursprung = vv2Ursprung;
	}

	public Integer getVv2Fromdatum() {
		return vv2Fromdatum;

	}

	public void setVv2Fromdatum(Integer vv2Fromdatum) {
		this.vv2Fromdatum = vv2Fromdatum;
	}

	public Integer getVv2Upphalder() {
		return vv2Upphalder;

	}

	public void setVv2Upphalder(Integer vv2Upphalder) {
		this.vv2Upphalder = vv2Upphalder;
	}

	public Integer getVv2Upphdat() {
		return vv2Upphdat;

	}

	public void setVv2Upphdat(Integer vv2Upphdat) {
		this.vv2Upphdat = vv2Upphdat;
	}

	public Integer getVv2Upphkod() {
		return vv2Upphkod;

	}

	public void setVv2Upphkod(Integer vv2Upphkod) {
		this.vv2Upphkod = vv2Upphkod;
	}

	public Integer getVv2PaAntm() {
		return vv2PaAntm;

	}

	public void setVv2PaAntm(Integer vv2PaAntm) {
		this.vv2PaAntm = vv2PaAntm;
	}

	public BigDecimal getVv2Tjtfakt() {
		return vv2Tjtfakt;

	}

	public void setVv2Tjtfakt(BigDecimal vv2Tjtfakt) {
		this.vv2Tjtfakt = vv2Tjtfakt;
	}

	public BigDecimal getVv2Upprfakt() {
		return vv2Upprfakt;

	}

	public void setVv2Upprfakt(BigDecimal vv2Upprfakt) {
		this.vv2Upprfakt = vv2Upprfakt;
	}

	public Integer getVv2Belopp() {
		return vv2Belopp;

	}

	public void setVv2Belopp(Integer vv2Belopp) {
		this.vv2Belopp = vv2Belopp;
	}

	public Integer getVv2Itt() {
		return vv2Itt;

	}

	public void setVv2Itt(Integer vv2Itt) {
		this.vv2Itt = vv2Itt;
	}

	public Integer getVv2Mtt() {
		return vv2Mtt;

	}

	public void setVv2Mtt(Integer vv2Mtt) {
		this.vv2Mtt = vv2Mtt;
	}

	public String getVv2Schablon() {
		return vv2Schablon;

	}

	public void setVv2Schablon(String vv2Schablon) {
		this.vv2Schablon = vv2Schablon;
	}

	public Integer getVv2Punderl() {
		return vv2Punderl;

	}

	public void setVv2Punderl(Integer vv2Punderl) {
		this.vv2Punderl = vv2Punderl;
	}

	public Integer getVv2Pskuld() {
		return vv2Pskuld;

	}

	public void setVv2Pskuld(Integer vv2Pskuld) {
		this.vv2Pskuld = vv2Pskuld;
	}

	public Integer getVv2Punderlar() {
		return vv2Punderlar;

	}

	public void setVv2Punderlar(Integer vv2Punderlar) {
		this.vv2Punderlar = vv2Punderlar;
	}

	public String getVv2Kbidr() {
		return vv2Kbidr;

	}

	public void setVv2Kbidr(String vv2Kbidr) {
		this.vv2Kbidr = vv2Kbidr;
	}

	public String getVv2Felsts() {
		return vv2Felsts;

	}

	public void setVv2Felsts(String vv2Felsts) {
		this.vv2Felsts = vv2Felsts;
	}

	public BigInteger getVv2APnr() {
		return vv2APnr;

	}

	public void setVv2APnr(BigInteger vv2APnr) {
		this.vv2APnr = vv2APnr;
	}

	public Integer getVv2PskuldSti() {
		return vv2PskuldSti;

	}

	public void setVv2PskuldSti(Integer vv2PskuldSti) {
		this.vv2PskuldSti = vv2PskuldSti;
	}

	public BigDecimal getVv2Kapfakt() {
		return vv2Kapfakt;

	}

	public void setVv2Kapfakt(BigDecimal vv2Kapfakt) {
		this.vv2Kapfakt = vv2Kapfakt;
	}

	public Integer getVv2Retro() {
		return vv2Retro;

	}

	public void setVv2Retro(Integer vv2Retro) {
		this.vv2Retro = vv2Retro;
	}

	public void setData(String baseData) {
		baseData = StringUtils.rightPad(baseData, 146);
		this.setVv2Pnr((BigInteger) DemoUtils.readFieldAsNumber(baseData.substring(0, 10), "##########", BigInteger.class));
		this.setVv2Kundid(baseData.substring(10, 16));
		this.setVv2Gruppid((Integer) DemoUtils.readFieldAsNumber(baseData.substring(16, 19), "###", Integer.class));
		this.setVv2BerDat((Integer) DemoUtils.readFieldAsNumber(baseData.substring(19, 27), "########", Integer.class));
		this.setVv2Berkod(baseData.substring(27, 29));
		this.setVv2Lkod(baseData.substring(29, 30));
		this.setVv2Myndk((Integer) DemoUtils.readFieldAsNumber(baseData.substring(30, 35), "#####", Integer.class));
		this.setVv2Kategori(baseData.substring(35, 36));
		this.setVv2Forml((Integer) DemoUtils.readFieldAsNumber(baseData.substring(36, 39), "###", Integer.class));
		this.setVv2Fslag(baseData.substring(39, 42));
		this.setVv2Debkod((Integer) DemoUtils.readFieldAsNumber(baseData.substring(42, 44), "##", Integer.class));
		this.setVv2Ftekngr(baseData.substring(44, 46));
		this.setVv2Ursprung(baseData.substring(46, 47));
		this.setVv2Fromdatum((Integer) DemoUtils.readFieldAsNumber(baseData.substring(47, 55), "########", Integer.class));
		this.setVv2Upphalder((Integer) DemoUtils.readFieldAsNumber(baseData.substring(55, 58), "###", Integer.class));
		this.setVv2Upphdat((Integer) DemoUtils.readFieldAsNumber(baseData.substring(58, 66), "########", Integer.class));
		this.setVv2Upphkod((Integer) DemoUtils.readFieldAsNumber(baseData.substring(66, 67), "#", Integer.class));
		this.setVv2PaAntm((Integer) DemoUtils.readFieldAsNumber(baseData.substring(67, 70), "###", Integer.class));
		this.setVv2Tjtfakt((BigDecimal) DemoUtils.readFieldAsNumber(baseData.substring(70, 75), "#.####", BigDecimal.class));
		this.setVv2Upprfakt((BigDecimal) DemoUtils.readFieldAsNumber(baseData.substring(75, 80), "##.###", BigDecimal.class));
		this.setVv2Belopp((Integer) DemoUtils.readFieldAsNumber(baseData.substring(80, 87), "#######", Integer.class));
		this.setVv2Itt((Integer) DemoUtils.readFieldAsNumber(baseData.substring(87, 90), "###", Integer.class));
		this.setVv2Mtt((Integer) DemoUtils.readFieldAsNumber(baseData.substring(90, 93), "###", Integer.class));
		this.setVv2Schablon(baseData.substring(93, 94));
		this.setVv2Punderl((Integer) DemoUtils.readFieldAsNumber(baseData.substring(94, 101), "#######", Integer.class));
		this.setVv2Pskuld((Integer) DemoUtils.readFieldAsNumber(baseData.substring(101, 108), "#######", Integer.class));
		this.setVv2Punderlar((Integer) DemoUtils.readFieldAsNumber(baseData.substring(108, 112), "####", Integer.class));
		this.setVv2Kbidr(baseData.substring(112, 113));
		this.setVv2Felsts(baseData.substring(113, 114));
		this.setVv2APnr((BigInteger) DemoUtils.readFieldAsNumber(baseData.substring(114, 124), "##########", BigInteger.class));
		this.setVv2PskuldSti((Integer) DemoUtils.readFieldAsNumber(baseData.substring(124, 131), "#######", Integer.class));
		this.setVv2Kapfakt((BigDecimal) DemoUtils.readFieldAsNumber(baseData.substring(131, 139), "####.####", BigDecimal.class));
		this.setVv2Retro((Integer) DemoUtils.readFieldAsNumber(baseData.substring(139, 146), "#######", Integer.class));

	}

	@Override
	public String toString() {
		return StringUtils.rightPad(getVv2Pnr().toString(), 10) + StringUtils.rightPad(getVv2Kundid().toString(), 6) + StringUtils.rightPad(getVv2Gruppid().toString(), 3) + StringUtils.rightPad(getVv2BerDat().toString(), 8) + StringUtils.rightPad(getVv2Berkod().toString(), 2) + StringUtils.rightPad(getVv2Lkod().toString(), 1) + StringUtils.rightPad(getVv2Myndk().toString(), 5) + StringUtils.rightPad(getVv2Kategori().toString(), 1) + StringUtils.rightPad(getVv2Forml().toString(), 3) + StringUtils.rightPad(getVv2Fslag().toString(), 3) + StringUtils.rightPad(getVv2Debkod().toString(), 2) + StringUtils.rightPad(getVv2Ftekngr().toString(), 2) + StringUtils.rightPad(getVv2Ursprung().toString(), 1) + StringUtils.rightPad(getVv2Fromdatum().toString(), 8) + StringUtils.rightPad(getVv2Upphalder().toString(), 3) + StringUtils.rightPad(getVv2Upphdat().toString(), 8) + StringUtils.rightPad(getVv2Upphkod().toString(), 1) + StringUtils.rightPad(getVv2PaAntm().toString(), 3)
				+ StringUtils.rightPad(getVv2Tjtfakt().toString(), 5) + StringUtils.rightPad(getVv2Upprfakt().toString(), 5) + StringUtils.rightPad(getVv2Belopp().toString(), 7) + StringUtils.rightPad(getVv2Itt().toString(), 3) + StringUtils.rightPad(getVv2Mtt().toString(), 3) + StringUtils.rightPad(getVv2Schablon().toString(), 1) + StringUtils.rightPad(getVv2Punderl().toString(), 7) + StringUtils.rightPad(getVv2Pskuld().toString(), 7) + StringUtils.rightPad(getVv2Punderlar().toString(), 4) + StringUtils.rightPad(getVv2Kbidr().toString(), 1) + StringUtils.rightPad(getVv2Felsts().toString(), 1) + StringUtils.rightPad(getVv2APnr().toString(), 10) + StringUtils.rightPad(getVv2PskuldSti().toString(), 7) + StringUtils.rightPad(getVv2Kapfakt().toString(), 8) + StringUtils.rightPad(getVv2Retro().toString(), 7);
	}

}