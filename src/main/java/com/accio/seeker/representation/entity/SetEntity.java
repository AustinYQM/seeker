package com.accio.seeker.representation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "card_set", indexes = @Index(columnList = "setName"))
@Getter
@Setter
public class SetEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", nullable = false)
  private Long id;
  
  private String setName;
  private String setCode;
  private int cardCount;
  
  @OneToMany(mappedBy = "set")
  private Set<CardEntity> cards;
}
