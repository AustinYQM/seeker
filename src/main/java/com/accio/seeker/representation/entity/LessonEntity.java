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
@Table(name = "lesson")
@Getter
@Setter
public class LessonEntity {
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
  
  
  private ECardType cardType = ECardType.LESSON;
  private String lesson;
  private int provideAmount;
  private String provideType;
  
  @ManyToMany
  @JoinTable(
    name = "lesson_artist",
    joinColumns = @JoinColumn(name = "card_id"), 
    inverseJoinColumns = @JoinColumn(name = "artist_id")
  )
  Set<ArtistEntity> artist;

}
