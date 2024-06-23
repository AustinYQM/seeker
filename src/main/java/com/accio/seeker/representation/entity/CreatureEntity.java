package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ECardType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("creature")
public class CreatureEntity extends CardEntity {

    private int cost;
    private String description;
    private int dmgEachTurn;
    private int health;

    private ECardType cardType = ECardType.CREATURE;
}
