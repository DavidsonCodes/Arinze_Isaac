package com.zikan.BankApplication.repository;

import com.zikan.BankApplication.entity.Transaction;
import jakarta.persistence.PostRemove;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Transaction findByTransactionId(String transactionId);
}
