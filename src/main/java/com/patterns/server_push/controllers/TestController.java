package com.patterns.server_push.controllers;


import config.AppConfig;
import core.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/")
public class TestController {

    @CrossOrigin
    @GetMapping (path = "test")
    public String test() {
        return "test";
    }
    

}
