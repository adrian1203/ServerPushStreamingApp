package com.patterns.server_push.controllers;


import com.patterns.server_push.domain.SimpleMessage;
import config.AppConfig;
import core.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/")
public class TestController {

    @CrossOrigin
    @GetMapping (path = "test")
    public String test() {
        return "test";
    }

    @CrossOrigin
    @PostMapping("/create")
    public ResponseEntity<SimpleMessage> createSimpleMessage(@RequestBody SimpleMessage simpleMessage) {

        ResponseEntity re = ResponseEntity.ok(simpleMessage);
        //this.zrealizowaneZleceniaService.wykonajTransakcje();
        return re;

    }


}
