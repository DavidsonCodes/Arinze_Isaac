package com.zikan.BankApplication.repository;



import com.zikan.BankApplication.entity.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountUserRepository extends JpaRepository<AccountUser, Integer> {

    AccountUser getByUsername(String username);

}