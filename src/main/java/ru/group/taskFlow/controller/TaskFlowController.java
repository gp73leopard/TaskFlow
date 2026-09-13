package ru.group.taskFlow.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.group.taskFlow.model.Task;
import ru.group.taskFlow.service.TaskService;


@AllArgsConstructor
@RestController
@RequestMapping("/tasks")
public class TaskFlowController {

    private final TaskService taskService;

    @PostMapping("/")
    public ResponseEntity<?> createTasks(@RequestBody Task body) {
        return taskService.createTask(body.getTitle(), body.getDescription());
    }
}
