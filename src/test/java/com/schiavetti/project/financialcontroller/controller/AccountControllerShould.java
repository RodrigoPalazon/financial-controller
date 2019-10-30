package com.schiavetti.project.financialcontroller.controller;

import com.schiavetti.project.financialcontroller.model.AccountModel;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Currency;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountControllerShould {

    private final String ACCOUNT_NAME = "ABN Amro";
    private final Long INITIAL_BALANCE = 1000L;
    private final Currency CURRENCY = Currency.getInstance("EUR");
    private final LocalDate INITIAL_DATE = LocalDate.of(2019, 10, 02);


    @Test
    void return_an_new_account_by(){

        AccountController accountController = new AccountController();
        AccountModel accountModel = accountController.createAccountBy(ACCOUNT_NAME, CURRENCY, INITIAL_BALANCE, INITIAL_DATE);

        assertEquals("ABN Amro",accountModel.getName());
        assertEquals(1000L, accountModel.getInitialBalance());
        assertEquals(Currency.getInstance("EUR"),accountModel.getCurrency());
        assertEquals(LocalDate.of(2019, 10, 02), accountModel.getInitialDate());
    }
}
