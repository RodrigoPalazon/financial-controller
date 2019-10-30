package com.schiavetti.project.financialcontroller.model;


import lombok.*;

import java.time.LocalDate;
import java.util.Currency;

/**
 * Account model class.
 * @author Ricardo Schiavetti
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountModel extends BaseEntity {
    private String name;
    private Long initialBalance;
    private Currency currency;
    private LocalDate initialDate;
}
