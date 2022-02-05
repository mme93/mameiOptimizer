package de.mameie.backend.rest.service;

import de.mameie.backend.rest.controller.REST;
import de.mameie.backend.rest.model.dto.CarTypeDto;
import de.mameie.backend.rest.model.entity.CarTypeEntity;
import de.mameie.backend.rest.repository.CarTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CarTypeService implements REST<CarTypeEntity> {

    private final CarTypeRepository carTypeRepository;

    @Autowired
    public CarTypeService(CarTypeRepository carTypeRepository) {
        this.carTypeRepository = carTypeRepository;
    }

    @Override
    public void delete(Long id) throws IOException {

    }

    @Override
    public CarTypeEntity get(Long id) throws IOException {
        return this.carTypeRepository.getById(id);
    }

    @Override
    public List<CarTypeEntity> getAll() throws IOException {
        return this.carTypeRepository.findAll();
    }

    @Override
    public void put(CarTypeEntity object) throws IOException {

    }

    @Override
    public void post(CarTypeEntity carTypeEntity) throws IOException {
        this.carTypeRepository.save(carTypeEntity);
    }
    public CarTypeDto convertEntityToDto(CarTypeEntity carTypeEntity){
        return new CarTypeDto(carTypeEntity.getType());
    }
}
