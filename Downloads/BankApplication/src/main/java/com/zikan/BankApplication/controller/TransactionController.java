package com.zikan.BankApplication.controller;


import com.zikan.BankApplication.entity.Transaction;
import com.zikan.BankApplication.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@AllArgsConstructor
@RestController
@RequestMapping ("/transactions")
public class TransactionController {


    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("")
    public ResponseEntity<List<Transaction>> getAllTransaction() {
        return transactionService.getAllTransaction();
    }

    @GetMapping("{id}")
    public ResponseEntity<Transaction> getById( @PathVariable Long id) {
        return transactionService.getById(id);
    }

    @GetMapping("/transId")
    public ResponseEntity<Transaction> getByTransactionId( @RequestParam String transactionId) {
        return transactionService.getByTransactionId(transactionId);
}
    @PostMapping("")
    public ResponseEntity<Transaction> postNewTransaction(Transaction transaction){
        return transactionService.postNewTransaction(transaction);

    }
}
