package com.jwlim.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {
	
	@GetMapping(value = "/dummyGet")
	public String getRedisStringValue(
			) throws Exception {
		
		return "docker container!!";
	}
}
