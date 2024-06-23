package com.accio.seeker.representation.entity.converters;

import com.accio.seeker.representation.enums.ECardType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TypeConverter implements AttributeConverter<ECardType, String> {
  
  @Override
  public String convertToDatabaseColumn(ECardType type) {
    return type.getPrettyName();
  }

  @Override
  public ECardType convertToEntityAttribute(String shortName) {
    return ECardType.fromPrettyName(shortName);
  }
}
