package de.mameie.backend.rest.repository;

import de.mameie.backend.rest.model.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity,Long> {
    Optional<MemberEntity> findByUsername(String username);
    Optional<MemberEntity> findByUsernameAndEmail(String username,String email);
}
