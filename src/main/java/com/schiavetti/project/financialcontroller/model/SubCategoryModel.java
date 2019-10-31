package com.schiavetti.project.financialcontroller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Sub Category class.
 * @author Ricardo Schiavetti
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubCategoryModel extends BaseEntity {
    private CategoryModel category;
    private String name;
    private String description;
}
