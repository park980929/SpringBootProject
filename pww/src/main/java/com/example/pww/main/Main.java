package com.example.pww.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class Main {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/")
	public String Main() {
		log.info("메인 페이지");
		
		
		return "main/main";
	}

}
