package com.bladyzamosc.author;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @RequestMapping("/author")
    public String greeting() {
        return "Your Author";
    }
}
