package com.schiavetti.project.financialcontroller.service;

import com.schiavetti.project.financialcontroller.model.AccountModel;

import java.time.LocalDate;
import java.util.Currency;

/**
 * Account service class.
 * @author Ricardo Schiavetti
 */
public class AccountService {
    public AccountModel createAccountBy(final String accountName, final Currency currency,
                                        final Long initialBalance, final LocalDate initialDate) {
        return AccountModel.builder()
                .name(accountName)
                .currency(currency)
                .initialBalance(initialBalance)
                .initialDate(initialDate)
                .build();
    }
}
