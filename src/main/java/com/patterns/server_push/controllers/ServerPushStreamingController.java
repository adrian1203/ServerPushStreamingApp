package com.patterns.server_push.controllers;


import com.patterns.server_push.domain.SimpleMessage;
import config.AppConfig;
import core.DefaultNotifyController;
import core.NotificationHandler;
import core.SessionHandler;
import factory.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class ServerPushStreamingController extends DefaultNotifyController {

    @Autowired
    NotificationHandler notificationHandler;
    @Autowired
    SessionHandler sessionHandler;

    public ServerPushStreamingController(NotificationHandler handler, SessionHandler sessionHandler) {
        super(handler, sessionHandler);
    }

    @CrossOrigin
    @GetMapping(path = "api/test")
    public String test() {
        return "test";
    }


    @CrossOrigin
    @PostMapping("api/create/{triggerEndpoint}")
    public void createSimpleMessage(@RequestBody SimpleMessage simpleMessage, @PathVariable String triggerEndpoint) {
        handleRequest(simpleMessage, triggerEndpoint);

    }
    @CrossOrigin
    @GetMapping(path = "api/simple-message")
    public List<Notification> get(){
        return showHistory("simple-message");
    }

}
