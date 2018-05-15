package de.swm.springsec.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;



@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping("/resources")
	public Map<String, String> home() {
		Map<String, String> model = new HashMap<String, String>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		System.out.println("test output");
		return model;
	}



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
