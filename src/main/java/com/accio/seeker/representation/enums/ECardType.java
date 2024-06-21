package com.accio.seeker.representation.enums;

public enum ECardType {
  LESSON("Lesson"),
  CREATURE("Creature");
  
  private final String prettyName;
  
  ECardType(String prettyName) {
    this.prettyName = prettyName;
  }
}
