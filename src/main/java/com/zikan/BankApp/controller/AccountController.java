package com.zikan.BankApp.controller;

import com.zikan.BankApp.entity.AccountUser;
import com.zikan.BankApp.service.AccountUserService;
//import jakarta.validation.Valid;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/v1/api")
public class AccountController {

    private final AccountUserService accountUserService;

    public AccountController(AccountUserService accountUserService) {
        this.accountUserService = accountUserService;
    }

    @GetMapping("/allAccount")
    public ResponseEntity<List<AccountUser>> getAllAccount(){
        return accountUserService.getAllAccounts();
    }
    @GetMapping("/account/{id}")
    public ResponseEntity<AccountUser> getAccountById(@PathVariable int id){
        return accountUserService.getAccountById(id);
    }
    @PostMapping("/createAccount")
    public ResponseEntity<AccountUser> createAccount ( @RequestBody @Valid AccountUser accountUser){
        return accountUserService.createAccount(accountUser);
    }
    @PutMapping("/updateAccount")
    public ResponseEntity<AccountUser> updateAccount (@PathVariable int id, @RequestBody @Valid AccountUser accountUser){
        return accountUserService.updateAccount(id, accountUser);
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity<AccountUser> deleteAccount (@PathVariable int id) {
        return accountUserService.deleteAccountById(id);
    }
}
