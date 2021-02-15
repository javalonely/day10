package com.example.enums.base;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

public interface BaseEnum<T extends Serializable> {

    T getValue();

    @JsonValue
    String toJsonObject();

}
