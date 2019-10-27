package com.schiavetti.project.financialcontroller.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.schiavetti.project.financialcontroller.AccountModel;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Currency;

public class AccountControllerShould {

    @Test
    void return_an_new_account(){
        AccountModel accountModel = AccountModel.builder()
                .name("ABN Amro")
                .currency(Currency.getInstance("EUR"))
                .initialBalance(1000L)
                .initialDate(LocalDate.of(2019, 10, 02))
                .build();

        assertEquals("ABN Amro",accountModel.getName());
        assertEquals(1000L, accountModel.getInitialBalance());
        assertEquals(Currency.getInstance("EUR"),accountModel.getCurrency());
        assertEquals(LocalDate.of(2019, 10, 02), accountModel.getInitialDate());
    }
}
