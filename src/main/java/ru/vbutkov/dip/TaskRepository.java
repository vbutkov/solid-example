package ru.vbutkov.dip;

import java.util.Optional;
import java.util.UUID;

public interface TaskRepository {
    Optional<TaskData> findTaskById(UUID taskId);
}
