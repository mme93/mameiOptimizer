package de.mameie.backend.rest.service;

import de.mameie.backend.rest.controller.REST;
import de.mameie.backend.rest.model.dto.BrandDto;
import de.mameie.backend.rest.model.entity.BrandEntity;
import de.mameie.backend.rest.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class BrandService implements REST<BrandEntity> {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void delete(Long id) throws IOException {

    }

    @Override
    public BrandEntity get(Long id) throws IOException {
        return null;
    }

    @Override
    public List<BrandEntity> getAll() throws IOException {
        return this.brandRepository.findAll();
    }

    @Override
    public void put(BrandEntity object) throws IOException {

    }

    @Override
    public void post(BrandEntity brandEntity) throws IOException {
        this.brandRepository.save(brandEntity);
    }
    public BrandDto convertEntityToDto(BrandEntity brandEntity){
        return new BrandDto(brandEntity.getName());
    }

}
