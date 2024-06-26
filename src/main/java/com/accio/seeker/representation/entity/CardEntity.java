package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ECardType;
import com.accio.seeker.representation.enums.EKeyword;
import com.accio.seeker.representation.enums.ELesson;
import com.accio.seeker.representation.enums.ERarity;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeOfCard")
@Getter
@Table(name = "card")
public abstract class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String cardName;
    private int setNumber;
    private String effect;

    @ManyToOne
    private SetEntity set;

    private ECardType cardType;

    @ElementCollection
    @JoinTable(name = "card_lessons", joinColumns = @JoinColumn(name = "card_id"))
    @CollectionTable(name = "card_lessons")
    private Set<ELesson> lesson = new HashSet<>();

    private ERarity rarity;
    private String flavorText;

    @ManyToMany
    @JoinTable(
            name = "card_artist",
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "artist_id"))
    private Set<ArtistEntity> artist = new HashSet<>();

    @ElementCollection
    @JoinTable(name = "card_keywords", joinColumns = @JoinColumn(name = "card_id"))
    @CollectionTable(name = "card_keywords")
    private Set<EKeyword> subTypes = new HashSet<>();

    public void addArtist(ArtistEntity artist) {
        this.artist.add(artist);
        artist.getCards().add(this);
    }

    public void removeArtist(ArtistEntity artist) {
        this.artist.remove(artist);
        artist.getCards().remove(this);
    }
}
