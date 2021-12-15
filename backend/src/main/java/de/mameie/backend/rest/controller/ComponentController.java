package de.mameie.backend.rest.controller;

import de.mameie.backend.rest.model.ModelConverter;
import de.mameie.backend.rest.model.dto.ComponentDto;
import de.mameie.backend.rest.model.entity.ComponentEntity;
import de.mameie.backend.rest.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/components")
public class ComponentController {

    private final ComponentRepository componentRepository;

    @Autowired
    public ComponentController(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }

    @GetMapping("")
    public List<ComponentDto>getAll(){
        List<ComponentDto>componentDtoList= new ArrayList<>();
        for(ComponentEntity componentEntity:componentRepository.findAll()){
            componentDtoList.add(ModelConverter.componentEntityConvertToDto().convert(componentEntity));
        }
        return componentDtoList;
    }

}
