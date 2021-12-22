package de.mameie.backend.rest.controller;

import de.mameie.backend.rest.model.ModelConverter;
import de.mameie.backend.rest.model.dto.CustomerDto;
import de.mameie.backend.rest.service.CustomerService;
import de.mameie.backend.rest.utils.SignGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @DeleteMapping("/delete/{email}")
    public String delete(@PathVariable("emailo")String email){
        System.out.println(email);
        return "success";
    }
    @PostMapping("/save")
    public String post(@RequestBody CustomerDto customerDto){
        customerDto.setSign(SignGenerator.getSign());
        customerService.save(ModelConverter.customerDtoConvertToEntity().convert(customerDto));
        return "Sucess";
    }
    @GetMapping("/{sign}")
    public CustomerDto get(@PathVariable("sign") String sign){
        return ModelConverter.customerEntityConvertToDto().convert(customerService.getCustomer(sign));
    }
    @GetMapping("/")
    public List<CustomerDto> getAll(){
        return ModelConverter.customerEntityListConvertToDtoList().convert(customerService.getAll());
    }
}