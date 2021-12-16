package de.mameie.backend.rest.service;

import de.mameie.backend.rest.exception.MainTaskNotFoundException;
import de.mameie.backend.rest.model.entity.MainTaskEntity;
import de.mameie.backend.rest.model.entity.TaskEntity;
import de.mameie.backend.rest.repository.MainTaskRepository;
import de.mameie.backend.rest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainTaskService {

    private final MainTaskRepository mainTaskRepository;
    private final TaskRepository taskRepository;

    @Autowired
    public MainTaskService(MainTaskRepository mainTaskRepository, TaskRepository taskRepository) {
        this.mainTaskRepository = mainTaskRepository;
        this.taskRepository = taskRepository;
    }

    public MainTaskEntity getMainTaskByTitle(String title) {
        Optional<MainTaskEntity> mainTaskEntity = mainTaskRepository.findByTitle(title);
        if (mainTaskEntity.isPresent()) {
            return mainTaskEntity.get();
        }
        throw new MainTaskNotFoundException("Maintask not found: " + title);

    }

    public void saveMainTask(MainTaskEntity mainTaskEntity) {
        mainTaskRepository.save(mainTaskEntity);
    }

    public void saveTaskList(List<TaskEntity> taskEntityList, MainTaskEntity mainTaskEntity) {
        for (TaskEntity taskEntity : taskEntityList) {
            mainTaskEntity.getTaskEntityList().add(taskEntity);
        }
        mainTaskRepository.save(mainTaskEntity);
    }
    public void deleteTasks(List<TaskEntity>taskEntityList){
        for(TaskEntity taskEntity:taskEntityList){
            taskRepository.deleteByTask(taskEntity.getTask());
        }
    }
}
