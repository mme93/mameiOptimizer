package de.mameie.backend.rest.repository;

import de.mameie.backend.rest.model.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
    CustomerEntity findBySign(String sign);
}
