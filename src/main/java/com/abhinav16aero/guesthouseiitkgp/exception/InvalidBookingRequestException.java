package com.abhinav16aero.guesthouseiitkgp.exception;

/**
 * @author Abhinav Kumar
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
