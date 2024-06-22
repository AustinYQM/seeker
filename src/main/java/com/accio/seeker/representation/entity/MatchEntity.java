package com.accio.seeker.representation.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import lombok.Getter;

@Entity
@DiscriminatorValue("match")
@Getter
public class MatchEntity extends CardEntity {
  private int cost;
  @ManyToMany
  @JoinTable(
      name = "match_subtype",
      joinColumns = @JoinColumn(name = "match_id"),
      inverseJoinColumns = @JoinColumn(name = "subtype_id"))
  private Set<SubtypeEntity> subTypes;
  
  private String toWin;
  private String prize;
  
  public void addSubType(SubtypeEntity subtype) {
    subTypes.add(subtype);
    subtype.getMatches().add(this);
  }
  public void deleteSubType(SubtypeEntity subtype) {
    subTypes.remove(subtype);
    subtype.getMatches().remove(this);
  }
}
