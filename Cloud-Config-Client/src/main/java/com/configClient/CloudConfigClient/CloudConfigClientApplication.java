package com.configClient.CloudConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudConfigClientApplication {

	@Value("${my.prop}")
	String message;
	
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigClientApplication.class, args);
	}
	
	@RequestMapping("/")
    public String home() {
        return message;
    }

}
