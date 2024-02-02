package com.skm.Fullstack.exception;

public class UserNotFoundExcepton extends RuntimeException{
    public UserNotFoundExcepton(Long id){
        super("Could not found the user with id"+id);
    }
}
