package com.zikan.BankApplication.repository;


import com.zikan.BankApplication.entity.AccountUser;
import com.zikan.BankApplication.entity.KnowYourCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KYCRepository extends JpaRepository<KnowYourCustomer, Integer> {
    KnowYourCustomer getByUser(AccountUser user);
}