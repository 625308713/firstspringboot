package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;


@RestController
public class HelloWorldController {
	
	@PostMapping(value = "main/login")
	@ResponseBody
    public User login(@RequestBody Map<String,String> map) {
		User p = new User();
		p.setName(map.get("name")+"...");
        return p;
    }
}
