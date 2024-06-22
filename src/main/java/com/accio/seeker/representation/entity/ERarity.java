package com.accio.seeker.representation.entity;

public enum ERarity {
  COMMON("Common"),
  C("C"),
  UNCOMMON("Uncommon"),
  U("U"),
  RARE("Rare"),
  R("R"),
  FOIL_PREMIUM("Foil Premium"),
  F("F"),
  HOLO_PORTRAIT_PREMIUM("Holo-Portrait Premium"),
  HP("HP"),;
  
  private final String prettyName;
  
  ERarity(String prettyName) {
    this.prettyName = prettyName;
  }
}
