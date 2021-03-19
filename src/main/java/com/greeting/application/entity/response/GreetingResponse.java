package com.greeting.application.entity.response;

import com.greeting.application.entity.model.GreetingEntity;

public class GreetingResponse {

    private final Long id;
    private final String content;

    public GreetingResponse(GreetingEntity greetingEntity) {
        this.id= greetingEntity.getId();
        this.content = greetingEntity.getContent();
    }

    public long getId() { return id; }

    public String getContent() { return content; }
}
