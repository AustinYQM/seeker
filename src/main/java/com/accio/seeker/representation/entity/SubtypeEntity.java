package com.accio.seeker.representation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.Getter;

@Entity
@Table(name = "subtype")
@Getter
public class SubtypeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", nullable = false)
  private Long id;
  
  @ManyToMany(mappedBy = "subTypes")
  private Set<CreatureEntity> creatures;
  
  public void addCreature(CreatureEntity creature) {
    creatures.add(creature);
    creature.getSubTypes().add(this);
  }
  
  public void removeCreature(CreatureEntity creature) {
    creatures.remove(creature);
    creature.getSubTypes().remove(this);
  }
  
  @ManyToMany(mappedBy = "subTypes")
  private Set<MatchEntity> matches;
  
  public void addMatch(MatchEntity match) {
    matches.add(match);
    match.getSubTypes().add(this);
  }
  public void removeMatch(MatchEntity match) {
    matches.remove(match);
    match.getSubTypes().remove(this);
  }
  
  
}
