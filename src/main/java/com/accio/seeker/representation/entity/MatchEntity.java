package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ECardType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("match")
public class MatchEntity extends CardEntity {
    private int cost;

    private String toWin;
    private String prize;

    private ECardType cardType = ECardType.MATCH;
}
