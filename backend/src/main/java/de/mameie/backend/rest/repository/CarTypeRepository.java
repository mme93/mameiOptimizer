package de.mameie.backend.rest.repository;

import de.mameie.backend.rest.model.entity.CarTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarTypeRepository extends JpaRepository<CarTypeEntity,Long> {
}
