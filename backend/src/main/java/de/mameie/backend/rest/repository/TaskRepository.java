package de.mameie.backend.rest.repository;

import de.mameie.backend.rest.model.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
    void deleteByTask(String task);
}
