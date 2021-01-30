package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class TestType {
    @Id
    private String id;

    private String firstName;
    private String lastName;

    public TestType(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}