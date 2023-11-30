package com.example.webapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class WebappApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);



	}
	@org.springframework.web.bind.annotation.RestController
	@RequestMapping("/")
	public static class RestController{
		@Value("${environment.variable.one}")
		String varOne;
		@GetMapping
		public ResponseEntity get(){
			return ResponseEntity.ok(varOne);
		}

	}

}
