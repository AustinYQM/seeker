package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ECardType;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;



@Entity
@DiscriminatorValue("lesson")
public class LessonEntity extends CardEntity {
  private int provideAmount;
  private String provideType;

}
