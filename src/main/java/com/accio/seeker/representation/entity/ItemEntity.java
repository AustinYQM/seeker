package com.accio.seeker.representation.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("item")
public class ItemEntity extends CardEntity{
  private int cost;
  private String description;
}
