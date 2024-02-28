package ru.vbutkov.dip;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Optional;
import java.util.UUID;

public class TaskRepositoryImpl implements TaskRepository {
    private JdbcTemplate jdbcTemplate;

    @Override
    public Optional<TaskData> findTaskById(UUID taskId) {
        throw new UnsupportedOperationException();
    }

}
