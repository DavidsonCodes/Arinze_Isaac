package com.zikan.BankApplication.service;

import com.zikan.BankApplication.entity.AccountUser;
import com.zikan.BankApplication.entity.KnowYourCustomer;
import com.zikan.BankApplication.repository.KYCRepository;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KYCService {

    @Autowired
    private KYCRepository kycRepository;


    public ResponseEntity <List<KnowYourCustomer>> getAllKyc(){
        return new ResponseEntity<>(kycRepository.findAll(), HttpStatus.OK);
    }
    public ResponseEntity <KnowYourCustomer> getById (int id) {
        return new ResponseEntity<>(kycRepository.findById(id).get(), HttpStatus.OK);
    }
    public ResponseEntity<KnowYourCustomer> createCustomerKyc(KnowYourCustomer customer){
        return new ResponseEntity<>(kycRepository.save(customer), HttpStatus.CREATED);
    }

    public ResponseEntity<KnowYourCustomer> updateCustomerKYC (KnowYourCustomer customer, int id){

        KnowYourCustomer kycCustomer = kycRepository.findById(id).get();

        kycCustomer.setAddress(customer.getAddress());
        kycCustomer.setDateOfBirth(customer.getDateOfBirth());
        kycCustomer.setNin(customer.getNin());
        kycCustomer.setUser(customer.getUser());
        kycCustomer.setBankVerificationNumber(customer.getBankVerificationNumber());
        kycCustomer.setStateOfResidence(customer.getStateOfResidence());
        kycCustomer.setNextOfKin(customer.getNextOfKin());
        kycCustomer.setLocalGovtOfResidence(customer.getLocalGovtOfResidence());

        return new ResponseEntity<>(kycRepository.save(customer), HttpStatus.CREATED);

    }

}
