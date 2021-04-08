package com.instana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoInstanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoInstanaApplication.class, args);
	}

	
	@RequestMapping("/instana")
	String getInstana() throws Exception {
		return "Instana api executed..!!";
	}
	
	
	@RequestMapping("/error")
	public String getInstanaError() throws Exception {
		
		int x =10/0;
		
		return "Instana api executed..!!";
	}
}
