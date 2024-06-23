package com.accio.seeker.representation.entity.converters;

import com.accio.seeker.representation.enums.EKeyword;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class KeywordConverter implements AttributeConverter<EKeyword, String> {

    @Override
    public String convertToDatabaseColumn(EKeyword keyword) {
        return keyword.getPrettyName();
    }

    @Override
    public EKeyword convertToEntityAttribute(String dbData) {
        return EKeyword.fromPrettyName(dbData);
    }
}
