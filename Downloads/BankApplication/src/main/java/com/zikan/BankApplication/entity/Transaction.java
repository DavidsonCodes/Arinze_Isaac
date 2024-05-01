package com.zikan.BankApplication.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Data
@Entity
@Table (name="transaction")
public class Transaction {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;

    @NotBlank
    @Length(min = 10)
    private String accountFrom;
    @NotBlank
    @Length (min = 10)
    private String accountTo;
    private Date transactionDate;
    private double amount;
    private String transactionId;
}
