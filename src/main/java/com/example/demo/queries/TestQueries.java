package com.example.demo.queries;

import java.util.ArrayList;
import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.models.TestType;

import org.springframework.stereotype.Component;

@Component
public class TestQueries implements GraphQLQueryResolver {
    public String getTestQuery() {
        return "The result";
    }

    public List<TestType> getAllTypes() {
        List<TestType> result = ArrayList<>();

        result.add(new TestType("Ian", "Bonnycastle"));

        return result;
    }
}