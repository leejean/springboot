package com.leejean.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/**
	 * http://127.0.0.1:8080/hello
	 * @return
	 */
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}