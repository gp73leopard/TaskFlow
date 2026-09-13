package ru.group.taskFlow.model;

import lombok.Data;

import java.util.Random;

@Data
public class Task {

    private long id;
    private String title;
    private String description;

    public Task(String title, String description) {
        this.id = generateId();
        this.title = title;
        this.description = description;
    }

    private long generateId() {
        return new Random().nextInt() + 10000;
    }
}
