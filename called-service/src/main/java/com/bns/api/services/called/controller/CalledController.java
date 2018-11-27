package com.bns.api.services.called.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callme")
public class CalledController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CalledController.class);
	
	@Autowired
	BuildProperties buildProperties;
	
	@GetMapping("/ping")
	public String ping() {
		LOGGER.info("Ping: name={}, version={}", buildProperties.getName(), buildProperties.getVersion());
		return buildProperties.getName() + ":" + buildProperties.getVersion(); 
	}
	
}
