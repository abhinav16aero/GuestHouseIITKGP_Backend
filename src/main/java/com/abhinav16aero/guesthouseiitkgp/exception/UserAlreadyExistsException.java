package com.abhinav16aero.guesthouseiitkgp.exception;

/**
 * @author Abhinav Kumar
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
