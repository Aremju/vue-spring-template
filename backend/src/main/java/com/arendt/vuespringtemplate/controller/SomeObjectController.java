package com.arendt.vuespringtemplate.controller;

import com.arendt.vuespringtemplate.model.dto.SomeObjectDto;
import com.arendt.vuespringtemplate.service.SomeObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/some_object")
public class SomeObjectController {

    private final SomeObjectService someObjectService;

    @Autowired
    public SomeObjectController(final SomeObjectService someObjectService) {
        this.someObjectService = someObjectService;
    }

    @GetMapping
    public ResponseEntity<List<SomeObjectDto>> getObject() {
        return ResponseEntity.ok(
                someObjectService.retrieveAllSomeObjects()
        );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSomeObject(@RequestBody final SomeObjectDto someObjectDto) {
        someObjectService.createSomeObjectInstance(someObjectDto);
    }
}
