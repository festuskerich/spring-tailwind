package com.francium.tailwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EntryController {

    @GetMapping(value="/")
    public String  getMethodName() {
        return "index";
    }
    
}
