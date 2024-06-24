package com.abhinav16aero.guesthouseiitkgp.exception;

/**
 * @author Abhinav Kumar
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
