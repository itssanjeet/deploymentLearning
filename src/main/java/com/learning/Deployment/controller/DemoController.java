package com.learning.Deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("demo")
public class DemoController {

    @GetMapping
    public Object getStringValue(){
        Map<String, String> hm = new HashMap<>();
        hm.put("name", "Sanjeet Kumar");
        hm.put("address", "Somewhere");
        return hm;
    }
}
