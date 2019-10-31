package com.schiavetti.project.financialcontroller.service;

import com.schiavetti.project.financialcontroller.model.AccountModel;

import java.time.LocalDate;
import java.util.Currency;

public class AccountService {
    public AccountModel createAccountBy(String account_name, Currency currency, Long initial_balance, LocalDate initial_date) {
        return AccountModel.builder()
                .name(account_name)
                .currency(currency)
                .initialBalance(initial_balance)
                .initialDate(initial_date)
                .build();
    }
}
