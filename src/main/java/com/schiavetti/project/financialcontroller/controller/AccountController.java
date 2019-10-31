package com.schiavetti.project.financialcontroller.controller;

import com.schiavetti.project.financialcontroller.model.AccountModel;
import com.schiavetti.project.financialcontroller.service.AccountService;

import java.time.LocalDate;
import java.util.Currency;

public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    public AccountModel createAccountBy(String name, Currency currency, Long initialBalance, LocalDate initialDate) {
        return accountService.createAccountBy(name, currency, initialBalance, initialDate);
    }
}
