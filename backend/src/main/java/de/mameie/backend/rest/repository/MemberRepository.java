package de.mameie.backend.rest.repository;

import de.mameie.backend.rest.model.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity,Long> {
}
