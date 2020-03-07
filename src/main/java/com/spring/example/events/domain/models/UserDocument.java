package com.spring.example.events.domain.models;

import lombok.ToString;

@ToString(callSuper = true)
public class UserDocument extends Document {

    public UserDocument(String value) {
        super(value);
    }

}
