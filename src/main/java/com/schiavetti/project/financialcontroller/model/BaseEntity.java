package com.schiavetti.project.financialcontroller.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

/**
 * Base entity class.
 *
 * @author Ricardo Schiavetti
 */
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@MappedSuperclass
@SuppressWarnings("PMD.UnusedFormalParameter")
public abstract class BaseEntity implements Serializable {

    @Id
    private String id;

    public BaseEntity(final String id) {
        this.id = UUID.randomUUID().toString();
    }
}
