package ru.vbutkov.dip;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private TaskService taskService;

    @GetMapping("{taskId}")
    public ResponseEntity<TaskData> findTaskById(
            @PathVariable final UUID taskId) {

        return ResponseEntity.of(this.taskService.findTaskById(taskId));
    }

}
