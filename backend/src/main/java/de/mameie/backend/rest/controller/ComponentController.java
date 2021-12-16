package de.mameie.backend.rest.controller;

import de.mameie.backend.rest.model.ModelConverter;
import de.mameie.backend.rest.model.dto.ComponentDto;
import de.mameie.backend.rest.model.entity.ComponentEntity;
import de.mameie.backend.rest.repository.ComponentRepository;
import de.mameie.backend.rest.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/components")
public class ComponentController {

    private final ComponentRepository componentRepository;
    private final ComponentService componentService;
    @Autowired
    public ComponentController(ComponentRepository componentRepository, ComponentService componentService) {
        this.componentRepository = componentRepository;
        this.componentService = componentService;
    }

    @GetMapping("")
    public List<ComponentDto>getAll(){
        List<ComponentDto>componentDtoList= new ArrayList<>();
        for(ComponentEntity componentEntity:componentRepository.findAll()){
            componentDtoList.add(ModelConverter.componentEntityConvertToDto().convert(componentEntity));
        }
        return componentDtoList;
    }
    @PostMapping("/save")
    public void save(@RequestBody ComponentDto componentDto){
        componentService.save(ModelConverter.componentDtoConvertToEntity().convert(componentDto));
    }

}
