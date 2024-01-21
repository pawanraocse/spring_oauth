package com.demo.oauth;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OauthApplication {


	public static void main(String[] args) {
		SpringApplication.run(OauthApplication.class, args);

        new ObjectMapper();
	}

}
