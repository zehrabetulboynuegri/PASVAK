package com.pasvak.asevi.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {
/*
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
  */
	   @RequestMapping("/")
	    public String index() {
	        return "index";
	    }
	   @RequestMapping("/plain-page")
    public String plainPage() {
        return "plain-page";
    }

	   @RequestMapping("/pricing-tables")
    public String pricingTables() {
        return "pricing-tables";
    }
}