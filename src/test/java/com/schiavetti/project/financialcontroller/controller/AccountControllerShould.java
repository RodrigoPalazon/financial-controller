package com.schiavetti.project.financialcontroller.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.schiavetti.project.financialcontroller.AccountModel;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AccountControllerShould {

    @Test
    void return_an_new_account(){
        AccountModel accountModel = new AccountModel();
        accountModel.setName("ABN Amro");
        accountModel.setInitialBalance(1000L);
        accountModel.setCurrency("EURO");
        accountModel.setInitialDate(LocalDate.of(2019, 10, 02));

        assertEquals("ABN Amro",accountModel.getName());
        assertEquals(1000L, accountModel.getInitialBalance());
        assertEquals("EURO",accountModel.getCurrency());
        assertEquals(LocalDate.of(2019, 10, 02), accountModel.getInitialDate());
    }
}
