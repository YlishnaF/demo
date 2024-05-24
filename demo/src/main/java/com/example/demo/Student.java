package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class Student {
    public int id;
    public String group;
    public String name;

    @JsonCreator
    public Student(int id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

}
