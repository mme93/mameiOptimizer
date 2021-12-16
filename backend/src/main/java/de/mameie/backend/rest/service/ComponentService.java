package de.mameie.backend.rest.service;

import de.mameie.backend.rest.exception.ComponentNotFoundException;
import de.mameie.backend.rest.model.ModelConverter;
import de.mameie.backend.rest.model.dto.ComponentDto;
import de.mameie.backend.rest.model.entity.ComponentEntity;
import de.mameie.backend.rest.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComponentService {

    private final ComponentRepository componentRepository;

    @Autowired
    public ComponentService(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }

    public void save(ComponentEntity componentEntity){
        componentRepository.save(componentEntity);
    }

    public ComponentDto getComponentByName(String name) {
        Optional<ComponentEntity> componentEntity = componentRepository.findByName(name);
        if (componentEntity.isPresent()) {
            return ModelConverter.componentEntityConvertToDto().convert(componentEntity.get());

        }
        throw new ComponentNotFoundException("Component Not Found: " + name);

    }

    public List<ComponentDto> getAllComponent() {
        List<ComponentDto> componentDtos = new ArrayList<>();
        for (ComponentEntity componentEntity : componentRepository.findAll()) {
            componentDtos.add(ModelConverter.componentEntityConvertToDto().convert(componentEntity));
        }
        return componentDtos;
    }

}
