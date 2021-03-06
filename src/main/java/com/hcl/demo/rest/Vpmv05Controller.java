package com.hcl.demo.rest;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.hcl.demo.dataobject.Vpmv05Wrapper;
import com.hcl.demo.exception.DemoBusinessException;
import com.hcl.demo.exception.DemoRestException;
import com.hcl.demo.service.IVpmv05Service;
import com.hcl.demo.util.DemoLogger;
import com.hcl.demo.util.DemoConstants;


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
 *
 * Author : Generated by ATMA ®
 * Revision History :
 *----------------------------------------------------------------------------------------------------------------------------------------------------
 *  ROW #	 DOCUMENT & Version,    			 REVISION DATE	 AUTHOR 				REVISION DESCRIPTION 		 REVISION TRACKING NOTES
 *    	     Release or Build Number
 *------------------------------------------------------------------------------------------------------------------------------------------------------
 *    1		 0.1												                   ATMA    		    Initial Conversion		   Converted from Legacy into Java
 *
 ******************************************************************************************************************************************************/

@RestController
@RequestMapping(value = "/vpmv05controller")
public class Vpmv05Controller {

    private static final DemoLogger LOGGER = DemoLogger.create(Vpmv05Controller.class);

    @Autowired
    private IVpmv05Service vpmv05Service;

    public void setIVpmv05Service(IVpmv05Service vpmv05Service) {
        this.vpmv05Service = vpmv05Service;
    }

    /*
     * Method execute
     * @param vpmv05Wrapper
     * @return vpmv05Wrapper
     * @throws DemoRestException
    */
    @RequestMapping(value = "/execute" , method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Vpmv05Wrapper execute(@RequestBody Vpmv05Wrapper vpmv05Wrapper) throws DemoRestException {
        LOGGER.debug(DemoConstants.REQUEST, vpmv05Wrapper);
        try {
            vpmv05Wrapper = vpmv05Service.execute(vpmv05Wrapper);
        } catch (DemoBusinessException dataEx) {
            LOGGER.error(DemoConstants.ERROR , dataEx);
            throw new DemoRestException(dataEx);
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR , ex);
            throw new DemoRestException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpmv05Wrapper);
        return vpmv05Wrapper;
    }
    /*
     * Method bInit
     * @param vpmv05Wrapper
     * @return vpmv05Wrapper
     * @throws DemoRestException
    */
    @RequestMapping(value = "/bInit" , method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Vpmv05Wrapper bInit(@RequestBody Vpmv05Wrapper vpmv05Wrapper) throws DemoRestException {
        LOGGER.debug(DemoConstants.REQUEST, vpmv05Wrapper);
        try {
            vpmv05Wrapper = vpmv05Service.bInit(vpmv05Wrapper);
        } catch (DemoBusinessException dataEx) {
            LOGGER.error(DemoConstants.ERROR , dataEx);
            throw new DemoRestException(dataEx);
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR , ex);
            throw new DemoRestException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpmv05Wrapper);
        return vpmv05Wrapper;
    }
    /*
     * Method insertTvvpsku
     * @param vpmv05Wrapper
     * @return vpmv05Wrapper
     * @throws DemoRestException
    */
    @RequestMapping(value = "/insertTvvpsku" , method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Vpmv05Wrapper insertTvvpsku(@RequestBody Vpmv05Wrapper vpmv05Wrapper) throws DemoRestException {
        LOGGER.debug(DemoConstants.REQUEST, vpmv05Wrapper);
        try {
            vpmv05Wrapper = vpmv05Service.insertTvvpsku(vpmv05Wrapper);
        } catch (DemoBusinessException dataEx) {
            LOGGER.error(DemoConstants.ERROR , dataEx);
            throw new DemoRestException(dataEx);
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR , ex);
            throw new DemoRestException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpmv05Wrapper);
        return vpmv05Wrapper;
    }
    /*
     * Method updateTvvpsku
     * @param vpmv05Wrapper
     * @return vpmv05Wrapper
     * @throws DemoRestException
    */
    @RequestMapping(value = "/updateTvvpsku" , method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Vpmv05Wrapper updateTvvpsku(@RequestBody Vpmv05Wrapper vpmv05Wrapper) throws DemoRestException {
        LOGGER.debug(DemoConstants.REQUEST, vpmv05Wrapper);
        try {
            vpmv05Wrapper = vpmv05Service.updateTvvpsku(vpmv05Wrapper);
        } catch (DemoBusinessException dataEx) {
            LOGGER.error(DemoConstants.ERROR , dataEx);
            throw new DemoRestException(dataEx);
        } catch (Exception ex) {
            LOGGER.error(DemoConstants.ERROR , ex);
            throw new DemoRestException(ex);
        }
        LOGGER.debug(DemoConstants.RESPONSE, vpmv05Wrapper);
        return vpmv05Wrapper;
    }
}