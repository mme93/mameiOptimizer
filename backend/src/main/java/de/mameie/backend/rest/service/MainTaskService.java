package de.mameie.backend.rest.service;

import de.mameie.backend.rest.exception.MainTaskNotFoundException;
import de.mameie.backend.rest.model.entity.MainTaskEntity;
import de.mameie.backend.rest.repository.MainTaskRepository;
import de.mameie.backend.rest.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public MainTaskEntity getMainTaskByTitle(String title){
        Optional<MainTaskEntity>mainTaskEntity=mainTaskRepository.findByTitle(title);
        if(mainTaskEntity.isPresent()){
            return mainTaskEntity.get();
        }
        throw new MainTaskNotFoundException("Maintask not found: "+title);

    }
    public void save(MainTaskEntity mainTaskEntity) {
        mainTaskRepository.save(mainTaskEntity);
    }
}
