package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ECardType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("lesson")
public class LessonEntity extends CardEntity {

    @ManyToMany
    @JoinTable(
            name = "lesson_provides",
            joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "provides_id"))
    Set<ProvidesEntity> provides = new HashSet<>();

    private ECardType cardType = ECardType.LESSON;

    public void addProvides(ProvidesEntity provides) {
        this.provides.add(provides);
        provides.getLessons().add(this);
    }

    public void removeProvides(ProvidesEntity provides) {
        this.provides.remove(provides);
        provides.getLessons().remove(this);
    }
}
