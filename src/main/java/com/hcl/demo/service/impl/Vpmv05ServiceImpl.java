package com.hcl.demo.service.impl;


import java.util.Date;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

import com.hcl.demo.repositories.IVpmv05Repository;
import com.hcl.demo.repositories.impl.Vpmv05RepositoryImpl;
import com.hcl.demo.service.IVpmv05Service;
import com.hcl.demo.exception.DemoBusinessException;
import com.hcl.demo.exception.DemoDataAccessException;
import com.hcl.demo.dataobject.*;
import com.hcl.demo.util.DemoLogger;
import com.hcl.demo.util.DemoConstants;
import com.hcl.demo.io.SequentialFileReader;
import com.hcl.demo.io.SequentialFileWriter;

/*************************************************************************
 *
 * HCL CONFIDENTIAL
 * _________________________________________________________________________________
 *
 * HCL is a trademark of HCL Company.
 *
 *Copyright © 2020 HCL. All rights reserved.
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
@Service
public   class Vpmv05ServiceImpl   implements  IVpmv05Service {

    private static final DemoLogger LOGGER = DemoLogger.create(Vpmv05ServiceImpl.class);

    @Autowired
    private IVpmv05Repository vpmv05Repository;

    public void setIVpmv05Repository(IVpmv05Repository vpmv05Repository) {
        this.vpmv05Repository = vpmv05Repository;
    }

    /*******************************************************************/
    /*    SUBMODUL TILL PROGRAM VPBV05.*/
    /*    SKRIVER      TVVPSKU*/
    /*******************************************************************/
    /*    UNDERHALLSJOURNAL.*/
    /*    -----------------*/
    /*    DATUM    ANDRING                                   ANDRAT AV*/
    /*    -----    -------                                   ---------*/
    /* 2018-02-12  Kompletterat med nya kolumnen retro       jasal*/
    /*******************************************************************/
    /*    RUTINFORTECKNING*/
    /*    VPMV09            HUVUDRUTIN SOM STYR BEARBETNINGEN*/
    /*******************************************************************/
    /*******************************************************************/
    /*    TABELL, TVVPSKU*/
    /*******************************************************************/
    /*******************************************************************/
    /* COBOL DECLARATION FOR TABLE TVVPSKU                            **/
    /*******************************************************************/
    /*******************************************************************/
    /* THE NUMBER OF COLUMNS DESCRIBED BY THIS DECLARATION IS 32      **/
    /*******************************************************************/
    /**
     * Method execute
     * @param vpmv05Wrapper
     * @return vpmv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpmv05Wrapper execute(Vpmv05Wrapper vpmv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpmv05Wrapper);
        try {
            Vpmv05BO vpmv05 = (Vpmv05BO) vpmv05Wrapper.getFirst(vpmv05Wrapper.getVpmv05BO(), Vpmv05BO.class);
            vpmv05Wrapper = bInit(vpmv05Wrapper);
            vpmv05Wrapper = insertTvvpsku(vpmv05Wrapper);
            
            int SqlCode=0;
            if(null!=vpmv05Wrapper.getSqlStatusCode()) {
            	SqlCode=vpmv05Wrapper.getSqlStatusCode();
            }
            
            if(SqlCode== 803) {
            	vpmv05Wrapper = updateTvvpsku(vpmv05Wrapper);
            }
            UtCvpmv05 utCvpmv05 = vpmv05.getUtCvpmv05();
            utCvpmv05.setUtCvpmv05Sqlkod(BigInteger.valueOf(SqlCode));
            return vpmv05Wrapper;
            /*EJECT*/
            /*******************************************************************/
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
       // LOGGER.debug(DemoConstants.RESPONSE, vpmv05Wrapper);
       // return vpmv05Wrapper;
    }

    /**
     * Method bInit
     * @param vpmv05Wrapper
     * @return vpmv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpmv05Wrapper bInit(Vpmv05Wrapper vpmv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpmv05Wrapper);
        try {
            Vpmv05BO vpmv05 = (Vpmv05BO) vpmv05Wrapper.getFirst(vpmv05Wrapper.getVpmv05BO(), Vpmv05BO.class);
            /*******************************************************************/
            Tvvpsku tvvpskuLocal = new Tvvpsku();
            vpmv05.setTvvpsku(tvvpskuLocal);
            vpmv05.getUtCvpmv05().setUtCvpmv05Sqlkod(BigInteger.valueOf(0));
            /*    FLYTTA TABELLDEKLARATION I KOMM-AREAN TILL TABELLEN.*/
            InCvpmv05 inCvpmv05 = vpmv05.getInCvpmv05();
            Tvvpsku tvvpsku = vpmv05.getTvvpsku();
            tvvpsku.setVv2Kundid(inCvpmv05.getCvpmv05Kundid());
            tvvpsku.setVv2Gruppid(inCvpmv05.getCvpmv05Gruppid());
            tvvpsku.setVv2Berkod(inCvpmv05.getCvpmv05Berkod());
            tvvpsku.setVv2BerDat(inCvpmv05.getCvpmv05BerDat());
            tvvpsku.setVv2Lkod(inCvpmv05.getCvpmv05Lkod());
            tvvpsku.setVv2Myndk(inCvpmv05.getCvpmv05Myndk());
            tvvpsku.setVv2Pnr(BigInteger.valueOf(inCvpmv05.getCvpmv05Pnr()));
            tvvpsku.setVv2Kategori(inCvpmv05.getCvpmv05Kategori());
            tvvpsku.setVv2Forml(inCvpmv05.getCvpmv05Forml());
            tvvpsku.setVv2Fslag(inCvpmv05.getCvpmv05Fslag());
            tvvpsku.setVv2Debkod(inCvpmv05.getCvpmv05Debkod());
            tvvpsku.setVv2Ftekngr(inCvpmv05.getCvpmv05Ftekngr());
            tvvpsku.setVv2Ursprung(inCvpmv05.getCvpmv05Ursprung());
            tvvpsku.setVv2Fromdatum(inCvpmv05.getCvpmv05Fromdatum());
            tvvpsku.setVv2Upphalder(inCvpmv05.getCvpmv05Upphalder());
            tvvpsku.setVv2Upphdat(inCvpmv05.getCvpmv05Upphdat());
            tvvpsku.setVv2Upphkod(inCvpmv05.getCvpmv05Upphkod());
            tvvpsku.setVv2PaAntm(inCvpmv05.getCvpmv05PaAntm());
            tvvpsku.setVv2Tjtfakt(inCvpmv05.getCvpmv05Tjtfakt());
            tvvpsku.setVv2Upprfakt(inCvpmv05.getCvpmv05Upprfakt());
            tvvpsku.setVv2Belopp(inCvpmv05.getCvpmv05Belopp());
            tvvpsku.setVv2Itt(inCvpmv05.getCvpmv05Itt());
            tvvpsku.setVv2Mtt(inCvpmv05.getCvpmv05Mtt());
            tvvpsku.setVv2Schablon(inCvpmv05.getCvpmv05Schablon());
            tvvpsku.setVv2Punderl(inCvpmv05.getCvpmv05Punderl());
            tvvpsku.setVv2Pskuld(inCvpmv05.getCvpmv05Pskuld());
            tvvpsku.setVv2Punderlar(inCvpmv05.getCvpmv05Punderlar());
            tvvpsku.setVv2Kbidr(inCvpmv05.getCvpmv05Kbidr());
            tvvpsku.setVv2Felsts(inCvpmv05.getCvpmv05Felsts());
            tvvpsku.setVv2APnr(BigInteger.valueOf(inCvpmv05.getCvpmv05APnr()));
            tvvpsku.setVv2PskuldSti(inCvpmv05.getCvpmv05PskuldSti());
            tvvpsku.setVv2Kapfakt(inCvpmv05.getCvpmv05Kapfakt());
            tvvpsku.setVv2Retro(inCvpmv05.getCvpmv05Retro());
            /*******************************************************************/
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpmv05Wrapper);
        return vpmv05Wrapper;
    }

    /**
     * Method insertTvvpsku
     * @param vpmv05Wrapper
     * @return vpmv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpmv05Wrapper insertTvvpsku(Vpmv05Wrapper vpmv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpmv05Wrapper);
        try {
            Vpmv05BO vpmv05 = (Vpmv05BO) vpmv05Wrapper.getFirst(vpmv05Wrapper.getVpmv05BO(), Vpmv05BO.class);
            /*******************************************************************/;
            vpmv05Wrapper = vpmv05Repository.insertTvvpsku0(vpmv05Wrapper);
            /*******************************************************************/
        } catch (DemoDataAccessException dataEx) {
            LOGGER.error(DemoConstants.ERROR, dataEx);
            throw new DemoBusinessException(dataEx);
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpmv05Wrapper);
        return vpmv05Wrapper;
    }

    /**
     * Method updateTvvpsku
     * @param vpmv05Wrapper
     * @return vpmv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpmv05Wrapper updateTvvpsku(Vpmv05Wrapper vpmv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpmv05Wrapper);
        try {
            Vpmv05BO vpmv05 = (Vpmv05BO) vpmv05Wrapper.getFirst(vpmv05Wrapper.getVpmv05BO(), Vpmv05BO.class);
            /*******************************************************************/
            vpmv05Wrapper = vpmv05Repository.updateTvvpsku1(vpmv05Wrapper);
            /*******************************************************************/
        } catch (DemoDataAccessException dataEx) {
            LOGGER.error(DemoConstants.ERROR, dataEx);
            throw new DemoBusinessException(dataEx);
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpmv05Wrapper);
        return vpmv05Wrapper;
    }

}