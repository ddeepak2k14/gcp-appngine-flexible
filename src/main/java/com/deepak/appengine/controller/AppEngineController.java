package com.deepak.appengine.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("appengine")
public class AppEngineController {
	
	@RequestMapping("hello")
	public static String HellpAppengine() {	
	StringBuilder message = new StringBuilder("Hello Google App Engine!");
    try {
      InetAddress ip = InetAddress.getLocalHost();
      message.append(" From host: " + ip);
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
      return message.toString();
    }
	
}
