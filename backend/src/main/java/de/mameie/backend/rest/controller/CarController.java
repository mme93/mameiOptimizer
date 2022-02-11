package de.mameie.backend.rest.controller;


import de.mameie.backend.rest.model.dto.BrandDto;
import de.mameie.backend.rest.model.dto.CarDto;
import de.mameie.backend.rest.model.dto.CarTypeDto;
import de.mameie.backend.rest.model.entity.BrandEntity;
import de.mameie.backend.rest.model.entity.CarTypeEntity;
import de.mameie.backend.rest.service.BrandService;
import de.mameie.backend.rest.service.CarService;
import de.mameie.backend.rest.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final BrandService brandService;
    private final CarTypeService carTypeService;
    private final CarService carService;

    @Autowired
    public CarController(BrandService brandService, CarTypeService carTypeService, CarService carService) {
        this.brandService = brandService;
        this.carTypeService = carTypeService;
        this.carService = carService;
    }

    @PostMapping(value = "/save")
    public void saveCar(@RequestBody CarDto carDto) throws IOException {
        this.carService.post(this.carService.convertDtoToEntity(carDto));
    }
    @GetMapping(value = "/licensePlate/{licensePlate}")
    public CarDto getCar(@PathVariable("licensePlate") String licensePlate) throws IOException {
        System.err.println(licensePlate);
        return this.carService.convertEntityToDto(this.carService.get(licensePlate));
    }
    @GetMapping(value = "/")
    public List<CarDto> getAllCars() throws IOException {
        List<CarDto> carDtos = new ArrayList<>();
        this.carService.getAll().forEach(carEntity -> carDtos.add(this.carService.convertEntityToDto(carEntity)));
        return carDtos;
    }

    @PostMapping(value = "/brand/{name}")
    public void saveBrand(@PathVariable("name") String brandName) throws IOException {
        brandService.post(new BrandEntity(brandName));
    }

    @GetMapping(value = "/brand")
    public List<BrandDto> loadBrands() throws IOException {
        List<BrandDto> brandDtos = new ArrayList<>();
        this.brandService.getAll().stream().forEach(brandEntity -> {
            brandDtos.add(brandService.convertEntityToDto(brandEntity));
        });
        return brandDtos;
    }

    @PostMapping(value = "/carType/{type}")
    public void saveCarType(@PathVariable("type") String type) throws IOException {
        carTypeService.post(new CarTypeEntity(type));
    }

    @GetMapping(value = "/carType")
    public List<CarTypeDto> loadCarType() throws IOException {
        List<CarTypeDto> carTypeDtos = new ArrayList<>();
        this.carTypeService.getAll().stream().forEach(carTypEntity -> {
            carTypeDtos.add(carTypeService.convertEntityToDto(carTypEntity));
        });
        return carTypeDtos;
    }


}
