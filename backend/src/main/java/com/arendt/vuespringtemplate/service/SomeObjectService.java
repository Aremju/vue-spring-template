package com.arendt.vuespringtemplate.service;

import com.arendt.vuespringtemplate.model.dto.SomeObjectDto;
import com.arendt.vuespringtemplate.model.entity.SomeObject;
import com.arendt.vuespringtemplate.model.mapper.SomeObjectMapper;
import com.arendt.vuespringtemplate.repository.SomeObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SomeObjectService {
    private final SomeObjectRepository someObjectRepository;

    @Autowired
    public SomeObjectService(final SomeObjectRepository someObjectRepository) {
        this.someObjectRepository = someObjectRepository;
    }

    public List<SomeObjectDto> retrieveAllSomeObjects() {
        return someObjectRepository.findAll().stream()
                .map(SomeObjectMapper::mapFromSomeObjectToSomeObjectDto)
                .toList();
    }

    public void createSomeObjectInstance(final SomeObjectDto someObjectDto) {
        final SomeObject fromDto = SomeObjectMapper.mapFromSomeObjectDtoToSomeObject(someObjectDto);

        someObjectRepository.save(fromDto);
    }
}
