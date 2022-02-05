package de.mameie.backend.rest.repository;

import de.mameie.backend.rest.model.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity,Long> {
}
