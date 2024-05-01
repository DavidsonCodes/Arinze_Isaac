package com.zikan.BankApplication.entity;

import lombok.Data;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;


@Data
public class AccountResource extends RepresentationModel<AccountResource> {

    private AccountUser accountObject;

    public AccountUser getAccountUser() {
        return accountObject;
    }

    public void setAccountUser(AccountUser accountObject) {
        this.accountObject = accountObject;
    }
}