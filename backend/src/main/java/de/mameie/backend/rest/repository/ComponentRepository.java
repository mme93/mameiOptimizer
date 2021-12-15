package de.mameie.backend.rest.repository;

import de.mameie.backend.rest.model.entity.ComponentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComponentRepository extends JpaRepository<ComponentEntity,Long> {

    Optional<ComponentEntity>findByName(String name);
}
