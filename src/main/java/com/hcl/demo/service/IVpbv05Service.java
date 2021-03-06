package com.hcl.demo.service;

import java.util.List;
import com.hcl.demo.dataobject.Vpbv05Wrapper;
import com.hcl.demo.exception.DemoBusinessException;

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
public interface IVpbv05Service  {

    public Vpbv05Wrapper execute(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException;
    public Vpbv05Wrapper bInit(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException;
    public Vpbv05Wrapper bMaskDat(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException;
    public Vpbv05Wrapper bMaskTid(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException;
    public Vpbv05Wrapper readInfil(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException;
    public Vpbv05Wrapper skrivTvvpsku(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException;
    public Vpbv05Wrapper skrivKoerlog(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException;
    public Vpbv05Wrapper zAbend(Vpbv05Wrapper vpbv05Wrapper) throws DemoBusinessException;
}