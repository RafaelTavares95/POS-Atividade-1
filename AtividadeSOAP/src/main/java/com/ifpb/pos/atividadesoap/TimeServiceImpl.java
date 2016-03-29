/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ifpb.pos.atividadesoap;

import java.util.Date;
import javax.jws.WebService;

/**
 *
 * @author Rafael
 */
@WebService(endpointInterface = "com.ifpb.pos.atividadesoap.TimeService")
public class TimeServiceImpl implements TimeService {

    @Override
    public String getTimeAsString() {
        return new Date().toString();
    }

    @Override
    public long getTimeAsElapsed() {
        return new Date().getTime();
    }

}