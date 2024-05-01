package com.zikan.BankApplication.controller;


import com.zikan.BankApplication.entity.AccountUser;
import com.zikan.BankApplication.entity.BankAccount;
import com.zikan.BankApplication.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;
    @GetMapping("")
    public ResponseEntity <List<BankAccount>> getAllBankAccounts(){
        return bankAccountService.getAllBankAccounts();
    }
    @GetMapping("/{id}")
    public ResponseEntity<BankAccount> getById(@PathVariable int id){
        return bankAccountService.getById(id);

    }
    @PostMapping("/opening_balance")
    public ResponseEntity<BankAccount> createBankAccount(@RequestBody AccountUser accountUser, @RequestParam double openingAmount){
        return bankAccountService.createBankAccount(accountUser, openingAmount);
    }
    @PostMapping("")
    public ResponseEntity<BankAccount> createBankAccount (@RequestBody AccountUser accountUser){
        return bankAccountService.createBankAccount(accountUser);
    }
    @GetMapping("/by-user")
    public ResponseEntity<BankAccount> getByUser (@RequestBody AccountUser user){
        return bankAccountService.getByUser(user);

    }
}
