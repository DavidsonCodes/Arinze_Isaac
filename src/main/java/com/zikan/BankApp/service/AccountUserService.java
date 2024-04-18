package com.zikan.BankApp.service;

import com.zikan.BankApp.Repository.AccountUserRepository;
import com.zikan.BankApp.entity.AccountUser;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountUserService {
    private final AccountUserRepository accountUserRepository;

    public AccountUserService(AccountUserRepository accountUserRepository) {
        this.accountUserRepository = accountUserRepository;
    }

    public ResponseEntity <List<AccountUser>> getAllAccounts (){
       return new ResponseEntity<>(accountUserRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<AccountUser> getAccountById(int id){
         AccountUser accountUser = accountUserRepository.findById(id).get();
        return new ResponseEntity<>( accountUser, HttpStatus.OK);
    }

    public ResponseEntity<AccountUser> createAccount (AccountUser accountUser){
        return  new ResponseEntity<>(accountUserRepository.save(accountUser), HttpStatus.CREATED);
    }
    public ResponseEntity<AccountUser> updateAccount(int id, AccountUser accountUser){
        AccountUser newAccount = accountUserRepository.findById(id).get();
        newAccount.setFirstName(accountUser.getFirstName());
        newAccount.setLastName(accountUser.getLastName());
        newAccount.setAccountType(accountUser.getAccountType());
        newAccount.setAccountBalance(accountUser.getAccountBalance());
        newAccount.setEmail(accountUser.getEmail());
        newAccount.setDateOfBirth(accountUser.getDateOfBirth());
        newAccount.setPhoneNumber(accountUser.getPhoneNumber());
        newAccount.setAccountNumber(accountUser.getAccountNumber());
        return new ResponseEntity<>(accountUserRepository.save(newAccount), HttpStatus.OK);
    }


    public ResponseEntity<AccountUser> deleteAccountById(int id){
        AccountUser accountUser = accountUserRepository.findById(id).get();
        return new ResponseEntity<>(accountUser, HttpStatus.OK);

    }
}
