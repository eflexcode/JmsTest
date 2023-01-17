package com.larrext.JmsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsTestApplication.class, args);
	}

}
