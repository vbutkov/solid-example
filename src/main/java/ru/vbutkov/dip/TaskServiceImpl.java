package ru.vbutkov.dip;

import java.util.Optional;
import java.util.UUID;

public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;

    @Override
    public Optional<TaskData> findTaskById(UUID taskId) {
        return this.taskRepository.findTaskById(taskId);
    }
}
