package com.zikan.BankApp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;


@Entity
@Table(name = "BankAccount")
public class AccountUser {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Length(min = 3, max = 20)
    private String firstName;
    @NotBlank
    @Length(min = 3, max = 20)
    private String lastName;
    @Column(unique = true)
    @NotBlank
    private String phoneNumber;

    @NotBlank
    private String accountType;
    @NotBlank
    @Column(unique = true)
    private String accountNumber;

    @Min(1000)
    @Max(100000000)
    private double accountBalance;

    @Min(1900)
    @Max(2024)
    private double dateOfBirth;

    @Column (unique = true)
    @Length (min = 10, message = "email should be minimun of 10 character long")
    private String email;


    public AccountUser(int id, String firstName, String lastName, String accountType, String phoneNumber, double dateOfBirth, String accountNumber, double accountBalance, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountType = accountType;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public AccountUser() {
    }

    public double getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(double dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AccountUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}
