/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ifpb.pos.atividadesoap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Rafael
 */
public class TimeClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("http://localhost:8000/ts?wsdl");
        QName qName=new QName("http://atividadesoap.pos.ifpb.com/", "TimeServiceImplService");
        Service service=Service.create(url,qName);
        TimeService timeService=service.getPort(TimeService.class);
        
        System.out.println(timeService.getTimeAsString());
        System.out.println(timeService.getTimeAsElapsed());
    }
}