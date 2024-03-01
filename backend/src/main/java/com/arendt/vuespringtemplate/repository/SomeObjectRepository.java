package com.arendt.vuespringtemplate.repository;

import com.arendt.vuespringtemplate.model.entity.SomeObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SomeObjectRepository extends JpaRepository<SomeObject, Long> {
}
