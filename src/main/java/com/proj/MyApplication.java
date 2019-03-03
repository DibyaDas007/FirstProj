package com.proj;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@SpringBootApplication
public class MyApplication {
	
	
		public static void main(String[] args) throws JsonGenerationException, IOException {
			SpringApplication.run(MyApplication.class, args);
	

		System.out.println("Hello");
		System.out.println("Das");
	}
}

