package com.arendt.vuespringtemplate.model.mapper;

import com.arendt.vuespringtemplate.model.dto.SomeObjectDto;
import com.arendt.vuespringtemplate.model.entity.SomeObject;

public class SomeObjectMapper {
    private SomeObjectMapper() {}

    public static SomeObject mapFromSomeObjectDtoToSomeObject(SomeObjectDto someObjectDto) {
        return new SomeObject(
                someObjectDto.getId(),
                someObjectDto.getText()
        );
    }

    public static SomeObjectDto mapFromSomeObjectToSomeObjectDto(SomeObject someObject) {
        return new SomeObjectDto(
                someObject.getId(),
                someObject.getMessage()
        );
    }
}
