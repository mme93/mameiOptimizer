package de.mameie.backend.rest.controller;

import de.mameie.backend.rest.model.ModelConverter;
import de.mameie.backend.rest.model.dto.MainTaskDto;
import de.mameie.backend.rest.model.entity.MainTaskEntity;
import de.mameie.backend.rest.model.entity.TaskEntity;
import de.mameie.backend.rest.service.MainTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class MainTaskController {

    private final MainTaskService mainTaskService;

    @Autowired
    public MainTaskController(MainTaskService mainTaskService) {
        this.mainTaskService = mainTaskService;
    }

    @GetMapping("")
    public List<MainTaskDto>getAll(){
        return null;
    }
    @GetMapping("/{title}")
    public MainTaskDto getMainTask(@PathVariable("title")String title){
        return ModelConverter.mainTaskEntityConvertToDto().convert(mainTaskService.getMainTaskByTitle(title));
    }
    @PostMapping("/save")
    public void save(@RequestBody MainTaskDto mainTaskDto){
        mainTaskService.save(ModelConverter.mainTaskDtoConvertToEntity().convert(mainTaskDto));
    }
    @GetMapping("/test")
    public void test(){
        List<TaskEntity>taskEntityList = new ArrayList<>();
        TaskEntity firstTask= new TaskEntity("HTML bauen");
        TaskEntity secondTask= new TaskEntity("Ionic init");
        taskEntityList.add(firstTask);
        taskEntityList.add(secondTask);
        MainTaskEntity mainTaskEntity= mainTaskService.getMainTaskByTitle("Programmieren");
        mainTaskEntity.setTaskEntityList(taskEntityList);
        mainTaskService.save(mainTaskEntity);
    }

}
