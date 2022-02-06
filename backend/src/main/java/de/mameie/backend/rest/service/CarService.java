package de.mameie.backend.rest.service;

import de.mameie.backend.rest.controller.REST;
import de.mameie.backend.rest.model.dto.CarDto;
import de.mameie.backend.rest.model.entity.CarEntity;
import de.mameie.backend.rest.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CarService implements REST<CarEntity> {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void delete(Long id) throws IOException {

    }

    @Override
    public CarEntity get(Long id) throws IOException {
        return null;
    }

    @Override
    public List<CarEntity> getAll() throws IOException {
        return this.carRepository.findAll();
    }

    @Override
    public void put(CarEntity object) throws IOException {

    }

    @Override
    public void post(CarEntity carEntity) throws IOException {
        this.carRepository.save(carEntity);
    }
    public  CarDto convertEntityToDto(CarEntity carEntity){
        return new CarDto(carEntity.getFin(),carEntity.getLicensePlate(),carEntity.getBrand(),carEntity.getModel(),carEntity.getOwner(),carEntity.getGear(),carEntity.getYearOfConstruction(),carEntity.getColor(),carEntity.getFuel(),carEntity.getTuev(),carEntity.getCarType());
    }
    public  CarEntity convertDtoToEntity(CarDto carDto){
        return new CarEntity(carDto.getFin(),carDto.getLicensePlate(),carDto.getBrand(),carDto.getModel(),carDto.getOwner(),carDto.getGear(),carDto.getYearOfConstruction(),carDto.getColor(),carDto.getFuel(),carDto.getTuev(),carDto.getCarType());
    }
}
