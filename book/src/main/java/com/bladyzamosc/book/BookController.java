package com.bladyzamosc.book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping("/book")
    public String greeting() {
        return "Your book";
    }
}
