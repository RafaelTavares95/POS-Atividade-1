/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ifpb.pos.atividadesoap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Rafael
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeService {
    @WebMethod
    String getTimeAsString();

    @WebMethod
    long getTimeAsElapsed();
}
