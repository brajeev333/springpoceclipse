package com.hcl.demo.service.impl;


import java.util.Date;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

//import com.hcl.demo.repositories.IVpbv05Repository;
import com.hcl.demo.repositories.IVpmv05Repository;
//import com.hcl.demo.repositories.impl.Vpbv05RepositoryImpl;
import com.hcl.demo.service.IE203abenService;
import com.hcl.demo.service.IVpbv05Service;
import com.hcl.demo.service.IVpmv05Service;
import com.hcl.demo.exception.DemoBusinessException;
import com.hcl.demo.exception.DemoDataAccessException;
import com.hcl.demo.dataobject.*;
import com.hcl.demo.dataobject.Vpbv05BO.FillerVpbv056;
import com.hcl.demo.util.DemoLogger;
import com.hcl.demo.util.DemoConstants;
import com.hcl.demo.io.SequentialFileReader;
import com.hcl.demo.io.SequentialFileWriter;
import java.util.List;

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
public   class Vpbv05ServiceImpl   implements  IVpbv05Service {

    private static final DemoLogger LOGGER = DemoLogger.create(Vpbv05ServiceImpl.class);

/*    @Autowired
    private IVpmv05Repository vpbv05Repository;

    public void setIVpbv05Repository(IVpbv05Repository vpbv05Repository) {
        this.vpbv05Repository = vpbv05Repository;
    }*/

    @Autowired
    private IVpmv05Service iVpmv05Service;

    public void setVpmv05Service(IVpmv05Service iVpmv05Service) {
        this.iVpmv05Service = iVpmv05Service;
    }
    @Autowired
    private IE203abenService iE203abenService;

    public void setE203abenService(IE203abenService iE203abenService) {
        this.iE203abenService = iE203abenService;
    }
    /*    SKRIVER:      TVVPSKU*/
    /*******************************************************************/
    /*      UNDERHALLSJOURNAL*/
    /*      -----------------*/
    /*      DATUM    ANDRING                           ANDRAT AV*/
    /*      -----    -------                           ---------*/
    /*  2018-02-12   Komplettering p.g.a. ny kolumn    jasal*/
    /*               i tabell TVVPSKU. Infilens langd*/
    /*               andrad och copy cvpmv05 kompl.*/
    /*               med retro kolumnen.*/
    /*******************************************************************/
    /*******************************************************************/
    /* FIL FRAN VPBV11*/
    /*******************************************************************/
    /*    MARKERAR OM SLUT PA INFIL*/
    /*******************************************************************/
    /*******************************************************************/
    /*    DEF. AV RADER FOR UTSKRIFT AV KORLOGG OCH ABENDRAPPORT.*/
    /*******************************************************************/
    /*******************************************************************/
    /*    ARBETSAREOR*/
    /*******************************************************************/
    /* AREOR FOR UTSKRIFT AV RAD SOM ABENDAR*/
    /*******************************************************************/
    /*    KORLOGG TEXT*/
    /*******************************************************************/
    /*******************************************************************/
    /*    COPYAREOR*/
    /*******************************************************************/
    /*******************************************************************/
    /* COBOL DECLARATION FOR TABLE TVVPSKU                            **/
    /*******************************************************************/
    /*******************************************************************/
    /* THE NUMBER OF COLUMNS DESCRIBED BY THIS DECLARATION IS 32      **/
    /*******************************************************************/
    /*>Y2K<********* BE203ABE START ********************************/
    /*                                                             */
    /*    NAMN: BE203ABE    VER:                  SKAPAD: 890302   */
    /*    ANM : FOR PROGRAMAVBROTT I BATCH        AV    : PKHB     */
    /*          DB2-PROGRAM.                      ANDRAD:          */
    /*                                                             */
    /***************************************************************/
    /*                                                             */
    /* RETURKOD                                                    */
    /* DUMPKOD                                                     */
    /*                                                             */
    /*************** BE203ABE SLUT *********************************/
    /*>Y2K<::::::::: BNEWDATY START ::::::::::::::::::::::::::::::::*/
    /*    NAMN: BNEWDATY    VER:                  SKAPAD: 1997*/
    /*    ANM : ANVANDES VID ALTERNATIVT          AV    : TOJE*/
    /*          KORDATUM.*/
    /*******************************************************************/
    /* DATUM  SIGN  FORKLARING*/
    /* 021010 MILAI Tva nya redigerade falt: MASK-DATUM-RED*/
    /*        KOR-DATUM-RED i formatet SSAA-MM-DD. Redigering med '-'*/
    /*        skots av copy BNEWDKOD respektive BNEWDKDN.*/
    /*******************************************************************/
    /*    ALTERNATIVT KORDATUM*/
    /*    KOR-DATUM, ANTINGEN FRAN DATUMFIL ELLER MASKINDATUM*/
    /*    REDIGERAT KOR-DATUM I FORMATET SSAA-MM-DD*/
    /*    DAGENS DATUM (= MASKINDATUM)*/
    /*:::::::::::::: BNEWDATY SLUT :::::::::::::::::::::::::::::::::*/
    /*******************************************************************/
    /**
     * Method execute
     * @param vpbv05Wrapper
     * @return vpbv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpbv05Wrapper execute(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpbv05Wrapper);
        try {
            Vpbv05BO vpbv05 = (Vpbv05BO) vpbv05Wrapper.getFirst(vpbv05Wrapper.getVpbv05BO(), Vpbv05BO.class);
            /*******************************************************************/
            bInit(vpbv05Wrapper);
            do {
                readInfil(vpbv05Wrapper);
            } while(vpbv05.isSlutInfil());
            /*   SLUT PA INFIL*/
            if(!vpbv05.isSlutInfil()) {
                Arbetsareor arbetsareor = vpbv05.getArbetsareor();
               // KorlogRead korlogRead = vpbv05.getKorlogRead();
                KorlogRead korlogRead = new KorlogRead();
                
                korlogRead.setKlSiffror1( BigDecimal.valueOf(arbetsareor.getArbAntalRader()));
               // KorlogWrite korlogWrite = vpbv05.getKorlogWrite();
                KorlogWrite korlogWrite = new KorlogWrite();
                korlogWrite.setKlSiffror2(BigDecimal.valueOf(arbetsareor.getArbAntalSkrivna()));
                //vikash changes 
                KoerlogPost koerlogPost = vpbv05.getKoerlogPost();
                koerlogPost.setKoerlogText(vpbv05.getKorlogRead().toString());
                skrivKoerlog(vpbv05Wrapper);
                vpbv05.setKorlogWrite(korlogWrite);
                
                koerlogPost.setKoerlogText(vpbv05.getKorlogWrite().toString());
                skrivKoerlog(vpbv05Wrapper);
                   vpbv05.setUtKJSlut(new UtKJSlut());
                koerlogPost.setKoerlogText(vpbv05.getUtKJSlut().toString());
                skrivKoerlog(vpbv05Wrapper);
            }
            /*    STANG FILER*/
           SequentialFileWriter sequentialFileWriterKoerlog = vpbv05.getSequentialFileWriterKoerlog();
           sequentialFileWriterKoerlog.write();
            //TODO ATMA : CLOSEINFILKOERLOG
           // break;
            /*******************************************************************/
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpbv05Wrapper);
        return vpbv05Wrapper;
    }

    /**
     * Method bInit
     * @param vpbv05Wrapper
     * @return vpbv05Wrapper
     * @throws DemoBusinessException
     */
    
    public  Vpbv05Wrapper bInit(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpbv05Wrapper);
        try {
            Vpbv05BO vpbv05 = (Vpbv05BO) vpbv05Wrapper.getFirst(vpbv05Wrapper.getVpbv05BO(), Vpbv05BO.class);
            
            List<Vpbv05BO> vpb051= new ArrayList<Vpbv05BO>();
            
           String filename = "test.txt";
            SequentialFileReader sequentialFileReaderInfil=   new SequentialFileReader(filename);
            sequentialFileReaderInfil.open();            
            vpbv05.setSequentialFileReaderInfil(sequentialFileReaderInfil);         

            SequentialFileWriter sequentialFileWriterKoerlog = vpbv05.getSequentialFileWriterKoerlog();         
            UtCvpmv05 utCvpmv05Local = new UtCvpmv05();           
            InCvpmv05 inCvpmv05Local = new InCvpmv05();                     
            Arbetsareor arbetsareorLocal = new Arbetsareor();                       
            if(null!=inCvpmv05Local)
            vpbv05.setInCvpmv05(inCvpmv05Local);
          
            if(null!=utCvpmv05Local)
            vpbv05.setUtCvpmv05(utCvpmv05Local);           
            
            vpbv05.setArbetsareor(arbetsareorLocal);            
            String str="";           
       
            
            bMaskDat(vpbv05Wrapper);
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpbv05Wrapper);
        return vpbv05Wrapper;
    }

    /**
     * Method bMaskDat
     * @param vpbv05Wrapper
     * @return vpbv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpbv05Wrapper bMaskDat(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpbv05Wrapper);
        try {
            Vpbv05BO vpbv05 = (Vpbv05BO) vpbv05Wrapper.getFirst(vpbv05Wrapper.getVpbv05BO(), Vpbv05BO.class);
            
            
            
            Vpbv05BO vpbv051 = new Vpbv05BO();
            vpbv05.setMaskDateY(new MaskDateY());
            vpbv05.getMaskDateY().setMaskDate(new MaskDate(LocalDate.now().format(DateTimeFormatter.ofPattern("yyMMdd"))));
           
            //vikash changes 
            MaskDateY maskDateY = vpbv05.getMaskDateY();
            MaskDateY.FillerMaskDate1 fillerMaskDate1 = vpbv05.getMaskDateY().getFillerMaskDate1();
            if(fillerMaskDate1.getMaskAa() > 95) {
                maskDateY.setMaskSs(new Integer(19));
            } else {
                maskDateY.setMaskSs(new Integer(20));
              //vikash changes 
                
               // vpbv05.setFillerVpbv056(new Vpbv05BO().new FillerVpbv056());
                Vpbv05BO.FillerVpbv056 fillerVpbv056 = vpbv05.getFillerVpbv056();
                vpbv05.setUtKDatum1(new UtKDatum1() );
                UtKDatum1 utKDatum1 = vpbv05.getUtKDatum1();
                if(null!=fillerVpbv056 &&null!=utKDatum1)
                utKDatum1.setUtKDatAkt(new Integer(fillerVpbv056.getMaskSsaammddA().getMaskSsaammdd()));
                
                //new FillerVpbv054(vpbv05);
                Vpbv05BO.FillerVpbv054 fillerVpbv054 = vpbv05.getFillerVpbv054();
                if(null!=fillerVpbv054 && null!=fillerVpbv056 )
                fillerVpbv054.getKorSsaammddA().setKorSsaammdd(new Integer(fillerVpbv056.getMaskSsaammddA().getMaskSsaammdd()));
            }
            bMaskTid(vpbv05Wrapper);
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpbv05Wrapper);
        return vpbv05Wrapper;
    }

    /**
     * Method bMaskTid
     * @param vpbv05Wrapper
     * @return vpbv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpbv05Wrapper bMaskTid(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpbv05Wrapper);
        try {
            Vpbv05BO vpbv05 = (Vpbv05BO) vpbv05Wrapper.getFirst(vpbv05Wrapper.getVpbv05BO(), Vpbv05BO.class);
            
            UtKDatum1 utKDatum1 = vpbv05.getUtKDatum1();//vikash changes 
          //vikash changes 
            vpbv05.setKoerlogPost(new KoerlogPost()); 
            
            KoerlogPost koerlogPost = vpbv05.getKoerlogPost();
            
            //vpbv05.getArbetsareor().setArbTime(00000);
            //String date="200710";
            vpbv05.getArbetsareor().setArbTime(Integer.parseInt((LocalDate.now().format(DateTimeFormatter.ofPattern("yyMMdd")))));
            //vpbv05.getArbetsareor().setArbTime(Integer.parseInt((date)));
            Arbetsareor.FillerArbetsareor1 fillerArbetsareor1 = vpbv05.getArbetsareor().getFillerArbetsareor1();
            ArbTid arbTid = vpbv05.getArbetsareor().getArbTid();
            arbTid.setArbTidHh(fillerArbetsareor1.getArbTimeHh());
            arbTid.setArbTidMm(fillerArbetsareor1.getArbTimeMm());
            Arbetsareor arbetsareor = vpbv05.getArbetsareor();
            utKDatum1.setUtKTidAkt(arbetsareor.getArbTid().toString());
            /*************** BDATEKOD SLUT **********************************/
            /*    UTSKRIFT AV KORLOGG, HUVUD*/
            //vikash changes 
            UtKJStart utKJStart = new  UtKJStart();
            vpbv05.setUtKJStart(utKJStart);
            vpbv05.setUtKBlank(new UtKBlank());
            vpbv05.setUtKDatum1(utKDatum1);
            
            koerlogPost.setKoerlogText(vpbv05.getUtKJStart().toString());
            skrivKoerlog(vpbv05Wrapper);
            koerlogPost.setKoerlogText(vpbv05.getUtKBlank().toString());
            skrivKoerlog(vpbv05Wrapper);
			
			 koerlogPost.setKoerlogText(vpbv05.getUtKDatum1().toString());
           // koerlogPost.setKoerlogText("tEST!!!!!");
			 skrivKoerlog(vpbv05Wrapper);
			
            koerlogPost.setKoerlogText(vpbv05.getUtKBlank().toString());
            skrivKoerlog(vpbv05Wrapper);
            /*******************************************************************/
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpbv05Wrapper);
        return vpbv05Wrapper;
    }

    /**
     * Method readInfil
     * @param vpbv05Wrapper
     * @return vpbv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpbv05Wrapper readInfil(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpbv05Wrapper);
        try {
            Vpbv05BO vpbv05 = (Vpbv05BO) vpbv05Wrapper.getFirst(vpbv05Wrapper.getVpbv05BO(), Vpbv05BO.class);
            /*******************************************************************/
            
            //vikash changes 
            
            SequentialFileReader sequentialFileReaderInfil =vpbv05.getSequentialFileReaderInfil();
            if(sequentialFileReaderInfil.readNextRecord()) {
            	 vpbv05.setInCvpmv05( new InCvpmv05(sequentialFileReaderInfil.getCurrentRecord()));
            }
            
            
          
            /*    LAS INFIL*/
           // if(!(sequentialFileReaderInfil.getReadNextRecord())) {
            if(!(sequentialFileReaderInfil.readNextRecord())) {
                vpbv05.setIndSlutInfil(new Integer(1));
                if(!vpbv05.isSlutInfil()) {
                    vpbv05.getArbetsareor().setArbAntalRader(vpbv05.getArbetsareor().getArbAntalRader()+1);
                    skrivTvvpsku(vpbv05Wrapper);
                }
                /*******************************************************************/
            } else {
                vpbv05.setInCvpmv05( new InCvpmv05(sequentialFileReaderInfil.getCurrentRecord()));//vikash changes 
            }
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpbv05Wrapper);
        return vpbv05Wrapper;
    }

    /**
     * Method skrivTvvpsku
     * @param vpbv05Wrapper
     * @return vpbv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpbv05Wrapper skrivTvvpsku(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpbv05Wrapper);
        try {
            Vpbv05BO vpbv05 = (Vpbv05BO) vpbv05Wrapper.getFirst(vpbv05Wrapper.getVpbv05BO(), Vpbv05BO.class);
            /*******************************************************************/
            //vikash chnages :
            
            Vpmv05Wrapper vpmv05Wrapper =new  Vpmv05Wrapper();
            
            Vpmv05BO vpmv05BO =  vpmv05Wrapper.getFirst(vpmv05Wrapper.getVpmv05BO(), Vpmv05BO.class);
            
            vpmv05BO.setInCvpmv05(vpbv05.getInCvpmv05());
            vpmv05BO.setUtCvpmv05(vpbv05.getUtCvpmv05());
            
            //Vpmv05Wrapper VPMV05  = iVpmv05Service.execute(vpbv05.getInCvpmv05(), vpbv05.getUtCvpmv05());
            Vpmv05Wrapper vpmv05  = iVpmv05Service.execute(vpmv05Wrapper);
            
            if(null!=vpmv05.getExeStatus())
            vpbv05Wrapper.setExeStatus(vpmv05.getExeStatus());
            if(null!=vpmv05.getSqlStatusCode())
            vpbv05Wrapper.setSqlStatusCode(vpmv05.getSqlStatusCode());
            
            UtCvpmv05 utCvpmv05 = vpbv05.getUtCvpmv05();
            //vikash changes .
            int i=0;
            BigInteger b = BigInteger.valueOf(i);
            if(utCvpmv05.getUtCvpmv05Sqlkod().equals(b)) {
                vpbv05.getArbetsareor().setArbAntalSkrivna(vpbv05.getArbetsareor().getArbAntalSkrivna()+1);
            } else {
                InCvpmv05 inCvpmv05 = vpbv05.getInCvpmv05();
                Arbetsareor arbetsareor = vpbv05.getArbetsareor();
                arbetsareor.setAbendPnr(BigInteger.valueOf(inCvpmv05.getCvpmv05Pnr()));
                arbetsareor.setAbendBerDat(inCvpmv05.getCvpmv05BerDat());
                arbetsareor.setAbendGruppid(inCvpmv05.getCvpmv05Gruppid());
                arbetsareor.setAbendKundid(inCvpmv05.getCvpmv05Kundid());
               // vpbv05.getUtKAbend6().setUtKAOvrigt("PNR: "+vpbv05.getArbetsareor().getAbendPnr()+" KUNDID:  "+vpbv05.getArbetsareor().getAbendKundid()+" GRUPPID: "+vpbv05.getArbetsareor().getAbendGruppid()+" BERDAT:  "+vpbv05.getArbetsareor().getAbendBerDat());
                zAbend(vpbv05Wrapper);
            }
            /*******************************************************************/
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpbv05Wrapper);
        return vpbv05Wrapper;
    }

    /**
     * Method skrivKoerlog
     * @param vpbv05Wrapper
     * @return vpbv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpbv05Wrapper skrivKoerlog(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpbv05Wrapper);
        try {
            Vpbv05BO vpbv05 = (Vpbv05BO) vpbv05Wrapper.getFirst(vpbv05Wrapper.getVpbv05BO(), Vpbv05BO.class);
            /*******************************************************************/
            /*    SKRIV POST PA KORLOGGEN*/
            
            //vikash changes 
            
           // SequentialFileWriter sequentialFileWriterKoerlog = new SequentialFileWriter("C://New folder/skrivKoerlog.txt");
            SequentialFileWriter sequentialFileWriterKoerlog = vpbv05.getSequentialFileWriterKoerlog();
            sequentialFileWriterKoerlog.addRecord(vpbv05.getKoerlogPost().toString());
            
           // vpbv05.setSequentialFileWriterKoerlog(sequentialFileWriterKoerlog);
            
            //sequentialFileWriterKoerlog.addRecord(vpbv05.getKoerlogPost());
            /*******************************************************************/
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpbv05Wrapper);
        return vpbv05Wrapper;
    }

    /**
     * Method zAbend
     * @param vpbv05Wrapper
     * @return vpbv05Wrapper
     * @throws DemoBusinessException
     */
    public  Vpbv05Wrapper zAbend(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException {
        LOGGER.debug(DemoConstants.REQUEST, vpbv05Wrapper);
        try {
            Vpbv05BO vpbv05 = (Vpbv05BO) vpbv05Wrapper.getFirst(vpbv05Wrapper.getVpbv05BO(), Vpbv05BO.class);
            
            UtKAbend1 utKAbend1 = new UtKAbend1();
            UtKAbend2 utKAbend2 = new UtKAbend2();
            UtKAbend3 utKAbend3 = new UtKAbend3();
            UtKAbend6 utKAbend6 = new UtKAbend6();
            UtKAbend8 utKAbend8 = new UtKAbend8();
            vpbv05.setUtKAbend1(utKAbend1);
            vpbv05.setUtKAbend2(utKAbend2);
            vpbv05.setUtKAbend3(utKAbend3);
            vpbv05.setUtKAbend6(utKAbend6);
            vpbv05.setUtKAbend8(utKAbend8);
            /*******************************************************************/
            /*    UTSKRIFT AV BLANKRAD PA KORLOGGEN*/
            KoerlogPost koerlogPost = vpbv05.getKoerlogPost();
            koerlogPost.setKoerlogText(vpbv05.getUtKBlank().toString());
            skrivKoerlog(vpbv05Wrapper);// added by vikash 
            /*    UTSKRIFT AV BLANKRAD PA KORLOGGEN*/
            koerlogPost.setKoerlogText(vpbv05.getUtKBlank().toString());
            skrivKoerlog(vpbv05Wrapper);
            /*    UTSKRIFT AV ABEND-RAPPORT HUVUD*/
            koerlogPost.setKoerlogText(vpbv05.getUtKAbend1().toString());
            skrivKoerlog(vpbv05Wrapper);
            /*    UTSKRIFT AV BLANKRAD PA KORLOGGEN*/

            //UtKAbend2 utKAbend2 = vpbv05.getUtKAbend2();
            utKAbend2.setUtKAVy("TVVPSKU");
            koerlogPost.setKoerlogText(vpbv05.getUtKAbend2().toString());
            skrivKoerlog(vpbv05Wrapper);

            UtCvpmv05 utCvpmv05 = vpbv05.getUtCvpmv05();
           // UtKAbend3 utKAbend3 = vpbv05.getUtKAbend3();
            utKAbend3.setUtKASqlkod(utCvpmv05.getUtCvpmv05Sqlkod());
            koerlogPost.setKoerlogText(vpbv05.getUtKAbend3().toString());
            skrivKoerlog(vpbv05Wrapper);

            /*    UTSKRIFT AV BLANKRAD PA KORLOGGEN*/
            koerlogPost.setKoerlogText(vpbv05.getUtKBlank().toString());
            skrivKoerlog(vpbv05Wrapper);

            //UtKAbend6 utKAbend6 = vpbv05.getUtKAbend6();
            koerlogPost.setKoerlogText(utKAbend6.getUtKAOvrigt().toString());
            skrivKoerlog(vpbv05Wrapper);

            /*    UTSKRIFT AV BLANKRAD PA KORLOGGEN*/
            koerlogPost.setKoerlogText(vpbv05.getUtKBlank().toString());
            skrivKoerlog(vpbv05Wrapper);

            /*    UTSKRIFT AV BLANKRAD PA KORLOGGEN*/
            koerlogPost.setKoerlogText(vpbv05.getUtKBlank().toString());
            skrivKoerlog(vpbv05Wrapper);

            /*    UTSKRIFT AV ABEND-RAPPORT SLUT*/
            koerlogPost.setKoerlogText(vpbv05.getUtKAbend8().toString());
            skrivKoerlog(vpbv05Wrapper);

            /*    MEDDELA OPERATOR ATT PROGRAMMET AVBRYTS*/
            LOGGER.info("EXEKVERINGEN AV PROGRAM VPBV09 AVBRYTS");
            /*    STANG FILER*/
            //vikash changes 
            //SequentialFileWriter sequentialFileWriterInfil   = vpbv05.getSequentialFileWriterInfil();
            //sequentialFileWriterInfil.write();
            SequentialFileWriter sequentialFileWriterKoerlog = vpbv05.getSequentialFileWriterKoerlog();
            sequentialFileWriterKoerlog.write();
            
            //TODO ATMA : CLOSEKOERLOGINFIL
            /*    ANROPA ABEND-PROGRAM FOR AVBROTT*/
            
            //vikash changes 
            E203abenWrapper e203abenWrapper = new E203abenWrapper();
            
			/*
			 * E203abenBO e203abenbo =
			 * e203abenWrapper.getFirst(e203abenWrapper.getE203abenBO(), E203abenBO.class);
			 * 
			 * e203abenbo.setE203abenDumpcode(vpbv05.getE203abenDumpcode());
			 * e203abenbo.setE203abenCondcode(vpbv05.getE203abenCondcode());
			 */
            E203abenWrapper E203ABEN  = iE203abenService.execute(e203abenWrapper);
            /*    AVSLUTA*/
           // break;
            /*******************************************************************/
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR, ex);
            throw new DemoBusinessException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpbv05Wrapper);
        return vpbv05Wrapper;
    }

}