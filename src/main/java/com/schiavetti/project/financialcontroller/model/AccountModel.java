package com.schiavetti.project.financialcontroller.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Currency;

/**
 * Account model class.
 * @author Ricardo Schiavetti
 */
@Getter
@Setter
@Builder(builderMethodName = "with")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Account")
public class AccountModel extends BaseEntity {

    @Column
    private String name;

    @Column
    private Long initialBalance;

    @Column
    private Currency currency;

    @Column
    private LocalDate initialDate;
}
