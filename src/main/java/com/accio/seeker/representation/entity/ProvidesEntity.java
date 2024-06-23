package com.accio.seeker.representation.entity;

import com.accio.seeker.representation.enums.ELesson;
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
@Getter
@Setter
@Table(name = "provides")
public class ProvidesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    
    private int provideAmount;
    private ELesson provideType;

    @ManyToMany(mappedBy = "provides")
    private Set<LessonEntity> lessons;

    public void addLesson(LessonEntity lesson) {
        this.lessons.add(lesson);
        lesson.getProvides().add(this);
    }

    public void removeLesson(LessonEntity lesson) {
        this.lessons.remove(lesson);
        lesson.getProvides().remove(this);
    }
}
