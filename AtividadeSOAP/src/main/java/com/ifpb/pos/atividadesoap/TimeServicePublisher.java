/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ifpb.pos.atividadesoap;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Rafael
 */
public class TimeServicePublisher {
    
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8000/ts",new TimeServiceImpl() );
    }

}