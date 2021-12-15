package de.mameie.backend.rest.controller;

import de.mameie.backend.rest.model.ModelConverter;
import de.mameie.backend.rest.model.dto.CustomerDto;
import de.mameie.backend.rest.service.CustomerService;
import de.mameie.backend.rest.utils.SignGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save")
    public void post(@RequestBody CustomerDto customerDto){
        customerDto.setSign(SignGenerator.getSign());
        customerService.save(ModelConverter.customerDtoToCustomerEntity().convert(customerDto));
    }
    @GetMapping("/{sign}")
    public CustomerDto get(@PathVariable("sign") String sign){
        return ModelConverter.customerEntityToCustomerDto().convert(customerService.getCustomer(sign));
    }



}
