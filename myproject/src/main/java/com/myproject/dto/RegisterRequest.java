package com.myproject.dto;

import lombok.Data;

@Data

public class RegisterRequest {
    private String username;
    private String password;
    private String email;
 private byte[] image;

}
