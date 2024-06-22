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
import lombok.Setter;

@Entity
@Table(name = "artist")
@Getter
@Setter
public class ArtistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String artistName;

    @ManyToMany(mappedBy = "artist")
    private Set<CardEntity> cards;
    
    public void addCard(CardEntity card) {
        this.cards.add(card);
        card.getArtist().add(this);
    }
    public void removeCard(CardEntity card) {
        this.cards.remove(card);
        card.getArtist().remove(this);
    }
    

}
