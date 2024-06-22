package com.accio.seeker.representation.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.Set;
import lombok.Getter;

@Entity
@DiscriminatorValue("creature")
@Getter
public class CreatureEntity extends CardEntity {

    private int cost;
    private String description;
    private int dmgEachTurn;
    private int health;
    private String flavorText;
    
    @ManyToMany
    @JoinTable(
            name = "creature_subtype",
            joinColumns = @JoinColumn(name = "creature_id"),
            inverseJoinColumns = @JoinColumn(name = "subtype_id"))
    private Set<SubtypeEntity> subTypes;
    
    

    @ManyToMany
    @JoinTable(
            name = "creature_artist",
            joinColumns = @JoinColumn(name = "creature_id"),
            inverseJoinColumns = @JoinColumn(name = "artist_id"))
    Set<ArtistEntity> artist;
    
    
    // Below are helper methods to manage bidirectional relationships
    public void addSubType(SubtypeEntity subtype) {
        subTypes.add(subtype);
        subtype.getCreatures().add(this);
    }
    public void removeSubType(SubtypeEntity subtype) {
        subTypes.remove(subtype);
        subtype.getCreatures().remove(this);
    }
}
