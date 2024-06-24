package com.abhinav16aero.guesthouseiitkgp.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Abhinav Kumar
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
