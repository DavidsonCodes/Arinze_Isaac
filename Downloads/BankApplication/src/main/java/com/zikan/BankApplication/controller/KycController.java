package com.zikan.BankApplication.controller;


import com.zikan.BankApplication.entity.KnowYourCustomer;
import com.zikan.BankApplication.service.KYCService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class KycController {

    @Autowired
    private KYCService kycService;

    @GetMapping("/kyc")
    public ResponseEntity<List<KnowYourCustomer>> getAllKYC() {
        return kycService.getAllKyc();
    }

    @GetMapping("/kyc/{id}")
    public ResponseEntity<KnowYourCustomer> getById(@PathVariable int id) {
        return kycService.getById(id);
    }

    @PostMapping("/")
    public ResponseEntity<KnowYourCustomer> createCustomerKYC(@RequestBody KnowYourCustomer customer) {
        return kycService.createCustomerKyc(customer);
    }

    @PutMapping
    public ResponseEntity<KnowYourCustomer> updateCustomerKYC(@RequestBody KnowYourCustomer  customer, @PathVariable int id) {
        return kycService.updateCustomerKYC(customer, id);
    }
}
