package de.mameie.backend.rest.service;

import de.mameie.backend.rest.model.dto.CustomerDto;
import de.mameie.backend.rest.model.entity.CustomerEntity;
import de.mameie.backend.rest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void save(CustomerEntity customerEntity) {
        customerRepository.save(customerEntity);
    }
    public void delete(String email){
        customerRepository.deleteByEmail(email);
    }
    public CustomerEntity getCustomer(String sign) {
        return customerRepository.findBySign(sign);
    }

    public List<CustomerEntity> getAll() {
        return customerRepository.findAll();
    }

}
