package com.schiavetti.project.financialcontroller.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Currency;
import java.util.Set;

/**
 * Account model class.
 *
 * @author Ricardo Schiavetti
 */
@Getter
@Setter
@Builder(builderMethodName = "with")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Accounts")
public class AccountModel extends BaseEntity {

    @Column
    private String name;

    @Column
    private Long initialBalance;

    @Column
    private Currency currency;

    @Column
    private LocalDate initialDate;

    @OneToMany(mappedBy = "account")
    private Set<TransactionModel> transactions;
}
