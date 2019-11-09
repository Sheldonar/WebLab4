package com.george.JavaWebLab4;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class JavaWebLab4Application implements ApplicationRunner {
	public static void main(String[] args) {
		SpringApplication.run(JavaWebLab4Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

	}
}