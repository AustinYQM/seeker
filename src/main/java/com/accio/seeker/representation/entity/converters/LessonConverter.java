package com.accio.seeker.representation.entity.converters;

import com.accio.seeker.representation.enums.ELesson;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class LessonConverter implements AttributeConverter<ELesson, String> {
  
  @Override
  public String convertToDatabaseColumn(ELesson lesson) {
    return lesson.getShortName();
  }
  
  @Override
  public ELesson convertToEntityAttribute(String dbData) {
    return ELesson.fromShortName(dbData);
  }
}
