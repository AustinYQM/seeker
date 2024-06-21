package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ECardType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "creature")
@Getter
@Setter
public class CreatureEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", nullable = false)
  private Long id;

  private String cardName;
  private String treatment;
  private int setNumber;

  @JsonIgnore
  @ManyToOne
  private SetEntity set;
  
  
  private int cost;
  private ECardType cardType = ECardType.CREATURE;
  //TODO ManyToMany subtypes
  private String description;
  private int dmgEachTurn;
  private int health;
  private String flavorText;
  private String rarity;

  @ManyToMany
  @JoinTable(
      name = "creature_artist",
      joinColumns = @JoinColumn(name = "creature_id"),
      inverseJoinColumns = @JoinColumn(name = "artist_id")
  )
  Set<ArtistEntity> artist;


}
