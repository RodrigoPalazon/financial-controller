package com.schiavetti.project.financialcontroller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel extends BaseEntity {
    private String name;
    private String description;
}
