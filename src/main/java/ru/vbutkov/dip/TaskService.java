package ru.vbutkov.dip;

import java.util.Optional;
import java.util.UUID;

public interface TaskService {
    Optional<TaskData> findTaskById(UUID taskId);
}
