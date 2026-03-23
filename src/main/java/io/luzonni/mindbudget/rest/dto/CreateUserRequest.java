package io.luzonni.mindbudget.rest.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CreateUserRequest {

    private String name;
    private String passwordHash;
    private String email;
    private Date birthday;

}
