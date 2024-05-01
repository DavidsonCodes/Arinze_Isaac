package com.zikan.BankApplication.repository;

import com.zikan.BankApplication.entity.AccountUser;
import com.zikan.BankApplication.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

    BankAccount findByUser(AccountUser user);
}
