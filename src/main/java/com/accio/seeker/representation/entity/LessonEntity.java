package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ECardType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("lesson")
public class LessonEntity extends CardEntity {
    private int provideAmount;
    private String provideType;

    private ECardType cardType = ECardType.LESSON;
}
