package de.mameie.backend.rest.service;

import de.mameie.backend.rest.model.ModelConverter;
import de.mameie.backend.rest.model.dto.CustomerDto;
import de.mameie.backend.rest.model.entity.CustomerEntity;
import de.mameie.backend.rest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void save(CustomerEntity customerEntity) {
        if (!customerRepository.existsByEmail(customerEntity.getEmail())) {
            customerRepository.save(customerEntity);
        }

    }

    public void delete(String email) {
        if(customerRepository.existsByEmail(email)){
            customerRepository.deleteByEmail(email);
        }
    }

    public void update(CustomerEntity customerEntity) {
        if(customerRepository.existsBySign(customerEntity.getSign())){
            CustomerEntity dbEntity = customerRepository.findBySign(customerEntity.getSign());
            customerEntity.setId(dbEntity.getId());
            customerEntity.setPassword(dbEntity.getPassword());
            customerRepository.save(customerEntity);
        }
    }

    public CustomerEntity getCustomer(String sign) {
        return customerRepository.findBySign(sign);
    }

    public List<CustomerEntity> getAll() {
        return customerRepository.findAll();
    }

}
