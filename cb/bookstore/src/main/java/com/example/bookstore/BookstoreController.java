package com.example.bookstore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by golagem on 9/19/17.
 */

@RestController
public class BookstoreController {

    @RequestMapping(value = "/recommended1")
    public String readingList(){
        return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
    }

}
