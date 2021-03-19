package com.greeting.application.service;

import com.greeting.application.entity.model.GreetingEntity;
import com.greeting.application.entity.request.GreetingRequest;
import com.greeting.application.entity.response.GreetingResponse;
import com.greeting.application.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    private static final String GREET_TEMPLATE = "Hello, %s!";

    public GreetingResponse greet(GreetingRequest greetingRequest) {
        GreetingEntity greetingEntity = new GreetingEntity();
        greetingEntity.setContent(String.format(GREET_TEMPLATE, greetingRequest.getName()));
        return new GreetingResponse(greetingRepository.save(greetingEntity));
    }
}
