package com.schiavetti.project.financialcontroller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Sub Category class.
 * @author Ricardo Schiavetti
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SubCategories")
public class SubCategoryModel extends BaseEntity {

    @ManyToOne
    private CategoryModel category;

    @Column
    private String name;

    @Column
    private String description;
}
