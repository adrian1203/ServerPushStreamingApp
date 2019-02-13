package com.patterns.server_push.controllers;


import com.patterns.server_push.domain.SimpleMessage;
import config.AppConfig;
import core.DefaultNotifyController;
import core.NotificationHandler;
import core.SessionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<SimpleMessage> createSimpleMessage(@RequestBody SimpleMessage simpleMessage, @PathVariable String triggerEndpoint) {
        super.handleRequest(simpleMessage, triggerEndpoint);

        ResponseEntity re = ResponseEntity.ok(simpleMessage);
        return re;

    }
    @CrossOrigin
    @GetMapping("/streaming/{triggerEndpoint}")
    public void stream(@PathVariable String triggerEndpoint){
        super.showHistory(triggerEndpoint);
    }
    

}
