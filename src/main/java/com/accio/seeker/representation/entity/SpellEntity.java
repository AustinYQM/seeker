package com.accio.seeker.representation.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("spell")
public class SpellEntity extends CardEntity {
  private int cost;
  private String description;
  private String flavorText;
}
