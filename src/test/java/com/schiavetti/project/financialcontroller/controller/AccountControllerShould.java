package com.schiavetti.project.financialcontroller.controller;

import com.schiavetti.project.financialcontroller.model.AccountModel;
import com.schiavetti.project.financialcontroller.service.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccountControllerShould {

    @Mock
    private AccountService accountService;

    private final String ACCOUNT_NAME = "ABN Amro";
    private final Long INITIAL_BALANCE = 1000L;
    private final Currency CURRENCY = Currency.getInstance("EUR");
    private final LocalDate INITIAL_DATE = LocalDate.of(2019, 10, 02);

    private final AccountModel ACCOUNT_DUMMY = AccountModel.with()
            .name(ACCOUNT_NAME)
            .currency(CURRENCY)
            .initialBalance(INITIAL_BALANCE)
            .initialDate(INITIAL_DATE)
            .build();


    @BeforeEach
    void setMockOutput() {
        when(accountService.createAccountBy(ACCOUNT_NAME, CURRENCY, INITIAL_BALANCE, INITIAL_DATE))
                .thenReturn(ACCOUNT_DUMMY);
    }


    @Test
    void return_an_new_account_by_name_currency_balance_and_date() {
        AccountController accountController = new AccountController(accountService);
        AccountModel createdAccount = accountController.createAccountBy(ACCOUNT_NAME, CURRENCY, INITIAL_BALANCE, INITIAL_DATE);

        assertEquals(ACCOUNT_DUMMY, createdAccount);
    }
}
