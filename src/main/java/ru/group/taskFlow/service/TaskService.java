package ru.group.taskFlow.service;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.group.taskFlow.model.Task;

@Service
public class TaskService {

    public ResponseEntity<?> createTask(String title, String description) {
        return new ResponseEntity<>(new Task(title, description), HttpStatusCode.valueOf(201));
    }
}
