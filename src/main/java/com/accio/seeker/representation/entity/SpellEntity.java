package com.accio.seeker.representation.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("spell")
public class SpellEntity extends CardEntity {
    private int cost;
}
