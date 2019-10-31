package com.schiavetti.project.financialcontroller.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Transaction class.
 * @author Ricardo Schiavetti
 */
@Getter
@Setter
@Builder
@Entity(name = "Transactions")
public class TransactionModel extends BaseEntity {

    @ManyToOne
    private CategoryModel category;

    @ManyToOne
    private SubCategoryModel subCategory;

    @ManyToOne
    private AccountModel account;

    @Enumerated(EnumType.STRING)
    private TransactionTypeEnum type;

    @Column
    private Long value;
}
