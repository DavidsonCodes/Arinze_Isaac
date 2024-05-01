package com.zikan.BankApplication.entity;

import com.zikan.BankApplication.service.AccountUserService;
import lombok.Data;

import java.sql.ConnectionBuilder;

@Data
public class LoginRequest {
    
private String username;
private String password;
}
