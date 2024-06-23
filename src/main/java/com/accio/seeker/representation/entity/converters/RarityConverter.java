package com.accio.seeker.representation.entity.converters;

import com.accio.seeker.representation.enums.ERarity;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RarityConverter implements AttributeConverter<ERarity, String> {
  
      @Override
      public String convertToDatabaseColumn(ERarity rarity) {
          return rarity.getShortName();
      }
  
      @Override
      public ERarity convertToEntityAttribute(String shortName) {
          return ERarity.fromShortName(shortName);
      }
}
