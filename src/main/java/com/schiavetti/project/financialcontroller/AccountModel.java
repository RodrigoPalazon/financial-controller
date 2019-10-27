package com.schiavetti.project.financialcontroller;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AccountModel {

    private String name;
    private Long initialBalance;
    private String currency;
    private LocalDate initialDate;
}
