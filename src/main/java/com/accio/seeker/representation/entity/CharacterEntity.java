package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ECardType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("character")
public class CharacterEntity extends CardEntity {
    private ECardType cardType = ECardType.CHARACTER;
}
