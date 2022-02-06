package de.mameie.backend.rest.repository;

import de.mameie.backend.rest.model.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity,Long> {
    CarEntity findByLicensePlate(String licensePlate);
}
