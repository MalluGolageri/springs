package com.example.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}




	@RequestMapping(value = "/recommended", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map readingList(){
		Map books=new HashMap<>();
		books.put("spring","Spring in Action (Manning)");
		books.put("O'Reilly","Cloud Native Java (O'Reilly)");
		books.put("spring boot","Learning Spring Boot (Packt)");
		return books;
	}


}
