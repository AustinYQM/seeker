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
    private Set<LessonEntity> lessonCards;
    
    @ManyToMany(mappedBy = "artist")
    private Set<CreatureEntity> creatureCards;

    public void addLesson(LessonEntity lesson) {
        lessonCards.add(lesson);
        lesson.getArtist().add(this);
    }

    public void removeLesson(LessonEntity lesson) {
        lessonCards.remove(lesson);
        lesson.getArtist().remove(this);
    }

    public void addCreature(CreatureEntity creature) {
        creatureCards.add(creature);
        creature.getArtist().add(this);
    }

    public void removecreature(CreatureEntity creature) {
        creatureCards.remove(creature);
        creature.getArtist().remove(this);
    }
}
