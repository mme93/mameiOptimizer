package de.mameie.backend.rest.controller;


import de.mameie.backend.rest.model.dto.BrandDto;
import de.mameie.backend.rest.model.entity.BrandEntity;
import de.mameie.backend.rest.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private final BrandService brandService;

    @Autowired
    public CarController(BrandService brandService) {
        this.brandService = brandService;
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


}
