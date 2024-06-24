package com.abhinav16aero.guesthouseiitkgp.exception;

/**
 * @author Abhinav Kumar
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
