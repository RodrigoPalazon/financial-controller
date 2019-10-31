package com.schiavetti.project.financialcontroller.controller;

import com.schiavetti.project.financialcontroller.model.AccountModel;
import com.schiavetti.project.financialcontroller.service.AccountService;

import java.time.LocalDate;
import java.util.Currency;

/**
 * Account controller class.
 * @author Ricardo Schiavetti
 */
public class AccountController {

    private final AccountService accountService;

    public AccountController(final AccountService accountService) {
        this.accountService = accountService;
    }

    public AccountModel createAccountBy(final String name, final Currency currency,
                                        final Long initialBalance, final LocalDate initialDate) {
        return accountService.createAccountBy(name, currency, initialBalance, initialDate);
    }
}
