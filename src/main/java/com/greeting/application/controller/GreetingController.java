package com.greeting.application.controller;

import com.greeting.application.entity.request.GreetingRequest;
import com.greeting.application.entity.response.GreetingResponse;
import com.greeting.application.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @PostMapping("/greeting/hello")
    public GreetingResponse defaultHello(@RequestBody GreetingRequest body) {
        return greetingService.greet(body);
    }

}
