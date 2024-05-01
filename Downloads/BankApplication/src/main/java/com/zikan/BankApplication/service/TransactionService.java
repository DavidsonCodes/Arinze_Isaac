package com.zikan.BankApplication.service;

import com.zikan.BankApplication.entity.Transaction;
import com.zikan.BankApplication.repository.TransactionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    public ResponseEntity <List<Transaction>> getAllTransaction(){
        return new ResponseEntity<>(transactionRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Transaction> getById (Long id){
        return  new ResponseEntity<>(transactionRepository.findById(id).get(), HttpStatus.OK);
    }

    public ResponseEntity<Transaction> getByTransactionId(String transactionId){
        return new ResponseEntity<>(transactionRepository.findByTransactionId(transactionId), HttpStatus.OK);
    }


    public ResponseEntity<Transaction> postNewTransaction(Transaction transaction){
        return new ResponseEntity<>(transactionRepository.save(transaction), HttpStatus.CREATED);

    }









}
