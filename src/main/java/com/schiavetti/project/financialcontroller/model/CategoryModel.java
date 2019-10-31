package com.schiavetti.project.financialcontroller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Category model class.
 * @author Ricardo Schiavetti
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Categories")
public class CategoryModel extends BaseEntity {

    @Column
    private String name;

    @Column
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<TransactionModel> transactions;

    @OneToMany(mappedBy = "category")
    private Set<SubCategoryModel> subCategories;
}
