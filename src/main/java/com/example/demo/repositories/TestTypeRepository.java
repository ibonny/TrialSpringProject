package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.TestType;

public interface TestTypeRepository extends CrudRepository<TestType, String> {

}