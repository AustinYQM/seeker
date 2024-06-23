package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ECardType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
@DiscriminatorValue("event")
public class EventEntity extends CardEntity {
  private int cost;
  private ECardType cardType = ECardType.EVENT;
}
