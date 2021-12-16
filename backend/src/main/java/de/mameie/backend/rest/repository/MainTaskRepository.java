package de.mameie.backend.rest.repository;

import de.mameie.backend.rest.model.entity.MainTaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MainTaskRepository extends JpaRepository<MainTaskEntity,Long> {
    Optional<MainTaskEntity>findByTitle(String title);
}
