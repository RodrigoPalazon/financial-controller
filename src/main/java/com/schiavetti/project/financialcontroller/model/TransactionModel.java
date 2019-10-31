package com.schiavetti.project.financialcontroller.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Transaction class.
 * @author Ricardo Schiavetti
 */
@Getter
@Setter
@Builder
public class TransactionModel extends BaseEntity {
    private CategoryModel category;
    private SubCategoryModel subCategory;
    private AccountModel account;
    private TransactionTypeEnum type;
    private Long value;
}
