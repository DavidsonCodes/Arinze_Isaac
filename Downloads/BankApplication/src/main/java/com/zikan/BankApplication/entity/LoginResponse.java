package com.zikan.BankApplication.entity;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {

    private AccountUser user;
    private String token;

}
