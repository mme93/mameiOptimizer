package de.mameie.backend.rest.controller;


import de.mameie.backend.rest.model.dto.BrandDto;
import de.mameie.backend.rest.model.dto.CarTypeDto;
import de.mameie.backend.rest.model.entity.BrandEntity;
import de.mameie.backend.rest.model.entity.CarTypeEntity;
import de.mameie.backend.rest.service.BrandService;
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

    @Autowired
    public CarController(BrandService brandService, CarTypeService carTypeService) {
        this.brandService = brandService;
        this.carTypeService = carTypeService;
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
