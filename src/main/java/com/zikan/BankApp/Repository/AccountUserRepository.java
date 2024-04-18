package com.zikan.BankApp.Repository;

import com.zikan.BankApp.entity.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountUserRepository extends JpaRepository<AccountUser, Integer> {

    AccountUser findByFirstName(String name);

    AccountUser findByEmail(String email);
}
