package de.mameie.backend.rest.controller;

import de.mameie.backend.rest.model.ModelConverter;
import de.mameie.backend.rest.model.dto.MainTaskDto;
import de.mameie.backend.rest.model.entity.MainTaskEntity;
import de.mameie.backend.rest.model.entity.TaskEntity;
import de.mameie.backend.rest.service.MainTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mainTask")
public class MainTaskController {

    private final MainTaskService mainTaskService;

    @Autowired
    public MainTaskController(MainTaskService mainTaskService) {
        this.mainTaskService = mainTaskService;
    }

    @GetMapping("")
    public List<MainTaskDto> getAll() {
        return null;
    }

    @GetMapping("/{title}")
    public MainTaskDto getMainTask(@PathVariable("title") String title) {
        return ModelConverter.mainTaskEntityConvertToDto().convert(mainTaskService.getMainTaskByTitle(title));
    }

    @PostMapping("/save")
    public void save(@RequestBody MainTaskDto mainTaskDto) {
        mainTaskService.saveMainTask(ModelConverter.mainTaskDtoConvertToEntity().convert(mainTaskDto));
    }

    @PostMapping("/task/{title}")
    public void postTask(@PathVariable("title") String title,@RequestBody List<TaskEntity> taskEntity) {
        MainTaskEntity mainTaskEntity = mainTaskService.getMainTaskByTitle(title);
        mainTaskService.saveTaskList(taskEntity,mainTaskEntity);
    }
    @Transactional
    @DeleteMapping("/delete/{title}")
    public void deleteTask(@PathVariable("title") String title,@RequestBody List<TaskEntity> taskEntity) {
        mainTaskService.deleteTasks(taskEntity);
    }
}
