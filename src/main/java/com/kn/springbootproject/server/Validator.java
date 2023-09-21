package com.kn.springbootproject.server;

public interface Validator<T> {
    boolean isValid(T object);
}
