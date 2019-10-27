package com.schiavetti.project.financialcontroller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Currency;

@Getter
@Setter
@Builder
public class AccountModel {

    private String name;
    private Long initialBalance;
    private Currency currency;
    private LocalDate initialDate;
}
