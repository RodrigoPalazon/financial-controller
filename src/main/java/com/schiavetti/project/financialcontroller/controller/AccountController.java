package com.schiavetti.project.financialcontroller.controller;

import com.schiavetti.project.financialcontroller.model.AccountModel;

import java.time.LocalDate;
import java.util.Currency;

public class AccountController {

    AccountModel createAccountBy(String name, Currency currency, Long initialBalance, LocalDate initialDate){
        return AccountModel.builder()
                .name(name)
                .currency(currency)
                .initialBalance(initialBalance)
                .initialDate(initialDate)
                .build();
    }
}
